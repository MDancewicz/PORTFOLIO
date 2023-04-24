use library; -- używa daną biblioteke
-- To jest komentarz

/** Select **/
-- Wyświetlenie wszystkich wierszy oraz kolumn
select * from authors;
-- Wyświetlenie wybranych kolumn
select title, publisher, release_date From books;
-- Wyświetlenie "n" wierszy
select * from rents limit 10;
-- Wyświetlenie unikatowych wierszy (z SELECTa, a nie z tabeli)
select first_name From employees; -- 17 wierszy (x2 Jakuby, x2 Ewa)
select distinct first_name from employees; -- 15 wierszy (x1 Jakuby, x1 Ewa)
select distinct last_name, first_name from employees; -- 17 wierszy
-- Aliasy dla kolumn (nazwy kolumn dla wyświetlanych danych)
select 
	first_name as imie, 
	last_name as nazwisko, 
	email as poczta 
from employees;

/* ZADANIE I
    Wyświetl:
    1. Wszystkie kolumny i wiersze z tabeli pracowników
    2. Imie, nazwisko klienta
    3. Jedynie 5 pozycji z tabeli autorów
    4. agent jako id_pracownika, customer jako id_klienta, rent_date jako data_wypozyczenia
        oraz return_date jako data_oddania z tabeli rents
    5. Nazwy miast (bez powtórzeń) z tabeli oddziałów
*/
-- zad 1
select * from employees;
-- zad 2
select first_name, last_name from customers;
-- zad 3
select * from authors limit 5;
-- zad 4
select 
	agent as id_pracownika,
	customer as id_klienta,
	rent_date as data_wypozyczenia,
    return_date as data_oddania
from rents;
-- zad 5
select distinct city from departments;

/** ORDER BY **/
--  Sortowanie domyślne (rosnące/A-Z/od najstarszej daty)
select * from employees order by salary; -- po wynagrodzeniu rosnąco
select * from employees order by first_name; -- po imieniu A-Z
select * from employees order by hire_date; -- od najstarszej daty
--  Sortowanie odwrotne (malejące/Z-A/od najnowszej daty)
select * from employees order by salary desc; -- po wynagrodzeniu malejąco
--  Sortowanie po kilku kolumnach
select * from employees order by hire_date desc, salary;

-- Limit ogranicza ilość wyświetlanych wierszy
-- Jest on wykonywany "na końcu", zatem w przypadku użycia z ORDER BY
-- Wyświetla "n" posortowanych wierszy

select * from employees
order by salary desc
limit 3;

/* ZADANIE II
    Wyświetl:
    1. Książki od najmłodszej
    2. Książki posortowane po kategorii malejąco, autorze rosnąco
    3. Ksiąki posortowane po wydawnictwie A-Z, dacie wydania od najmłodszej
    4. Wypożyczenia od najstarszego (rent_date)
    5. Autorów po imieniu A-Z
    6. 10 najstarszych wypożyczeń
*/
-- zad 1
select * from books order by release_date desc;
-- zad 2
select * from books order by category desc, author;
-- zad 3
select * from books order by publisher, release_date desc;
-- zad 4
select * from rents order by rent_date;
-- zad 5
select * from authors order by first_name;
-- zad 6
select * from rents order by rent_date limit 10;

/** FUNKCJE **/
-- CONCAT
select concat(first_name, ' ', last_name) as Pracownik 
from employees;
-- LENGTH
select name, length(name) from categories;
-- UPPER/LOWER
select title, upper(title), lower(title) from books;
-- SUBSTR
select 
	substr('Ala ma kota',3) as od_3_znaku,
 	substr('Ala ma kota',5) as od_5_znaku,
	substr('Ala ma kota',2,4) as od_2_znaku_4_znaki;

/* ZADANIE III
    Wyświetl:
    1. Długość imienia każdego pracownika
    2. Tytuł i wydawnictwo każdej książki jako pojedyncza kolumna z separatorem '-'
    3. Imię z wielkich, nazwisko z małych klientów
    4. Od 5 do 9 znaku z każdego tytułu książki
*/
-- zad 1
select first_name, length(first_name) as Ilość_znakow from employees;
-- zad 2
select concat(title, '-', publisher) as Opis_książki from books;
-- zad 3
select upper(first_name) as Imie, lower(last_name) as Nazwisko from customers;
-- zad 4
select title, substr(title,5,5) as Od_5_do_9_znaku from books;

-- NOW, CURRENT_DATE, CURRENT_TIME, CURRENT_TIMESTAMP
select
	now(),
    current_date(),
    current_time(),
    current_timestamp();
    
-- DAY, MONTH, YEAR (Daty podajemy jako tekst według wzorca)
select 
	day('2023-03-26'), month('2023-03-26'), year('2023-03-26');
    
select day(hire_date) from employees;

-- DATEDIFF
select datediff(now(),'2023-01-01');

/* ZADANIE IV
    Wyświetl:
    1. Wyświetl wiek (w dniach) każdej książki
    2. Wyświetl miesiąc zatrudnienia każdego pracownika
    3. Wyświetl czas wypożyczenia każdego wypożyczenia
    4. Wyświetl dzień, miesiąc, rok wydania książki w oddzielnych kolumnach
*/
-- zad 1
select datediff(now(), release_date) as Wiek_książki from books;
-- zad 2
select month(hire_date) as Miesiąc_zatrudnienia from employees;
-- zad 3
select datediff(return_date, rent_date) as Czas_wypożyczenia from rents;
-- zad 4
select day(release_date) as Dzień_wydania, month(release_date) as Miesiąc_wydania, year(release_date) as Rok_wydania from books;

/** WHERE **/
-- Operatory arytmetyczne (=,!=,<,>,<=,>=)
select * from books where publisher = 'Bellona';
select * from employees where salary > 10000;
select * from books where year(release_date) >= 2020;
-- Operatory logiczne
select * from books where author = 3 and publisher = 'Helion';
select * from books where publisher = 'Helion' or author = 3;
select * from employees where salary > 10000 or year(hire_date) < 2020;

/* ZADANIE V
    Wyświetl:
    1. Książki z wydawnictwa MAG
    2. Pracowników z drugiego oddziału
    3. Autorów o ID większy bądz równym 10
    4. Pracowników, którzy zarabiają maksymalnie 8000 i są z 4 oddziału
    5. Wypożyczenia ze stycznia (dowolnego roku)
    6. Wypożyczenia, który czas wypożyczenia nie przekroczył 40 dni
    7. Książki, których tytuł ma więcej niż 15 znaków
*/
-- zad 1
select * from books where publisher = 'MAG';
-- zad 2
select * from employees where department = 2;
-- zad 3
select * from authors where id >= 10;
-- zad 4
select * from employees where salary <= 8000 and department = 4;
-- zad 5 
select * from rents where month(rent_date) = 1;
-- zad 6
select * from rents where datediff(return_date, rent_date) <=40;
-- zad 7 
select * from books where length(title) > 15;

-- [NOT] BEETWEEN ... AND ...
Select * from employees where salary between 8000 and 10000;

-- [NOT] IN ()
Select * from employees where first_name in ('Jakub');
Select * from books where publisher in ('Helion','MAG','Bellona');

-- IS [NOT] NULL
select * from categories where description is null;

/* ZADANIE VI
    Wyświetl:
    1. Wypożyczenia, które nie zostały zwrócone
    2. Pracowników z oddziałów 1,2,3
    3. Książki, które nie zostały wydane przez MAG, Świat Książki albo Bellona
    4. Wypożyczenia pomiędzy (rent_date) 2021-11-15, a 2022-01-15
*/
-- zad 1
select * from rents where return_date is null;
-- zad 2
Select * from employees where department in (1,2,3);
-- zad 3
Select * from books where publisher not in ('MAG','Świat Książki','Bellona');
-- zad 4
Select * from rents where rent_date between '2021-11-15' and '2022-01-15'; 

/** JOIN **/
select 
	authors.first_name,
    authors.last_name,
    books.title
from books
join authors on authors.id = books.author;

/*
    Wyświetl za pomocą jednego zapytania:
    1. imie, nazwisko pracownika i nazwę oddziału
    2. tytuł książki i nazwa kategorii
    3. nazwę książki, imie i nazwisko klienta oraz datę oddania i wypożyczenia
*/
-- zad 1
-- zad 2
-- zad 3