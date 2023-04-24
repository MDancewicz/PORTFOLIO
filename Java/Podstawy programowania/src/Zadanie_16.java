import java.util.Scanner;
public class Zadanie_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Podpunkt a) Liczba " + number + " jest większa od zera.");
        } else if (number < 0) {
            System.out.println("Podpunkt a) Liczba " + number + " jest mniejsza od zera.");
        } else {
            System.out.println("Podpunkt a) Liczba " + number + " jest równa zero.");
        }
        if (number % 2 == 0) {
            System.out.print("Podpunkt b) Liczba " + number + " jest parzysta.");
        } else {
            System.out.print("Podpunkt b) Liczba " + number + " jest nieparzysta.");
        }
    }
}