public class Zadanie_13 {
    public static void main(String[] args) {
        int temp = 1;
        System.out.println("Liczba początkowa wynosi: " + temp);
        temp = temp + 1;
        System.out.println("Liczba została zwiększona  o 1 przy użyciu (a=a+1) i wynosi: " + temp);
        ++temp;
        System.out.println("Liczba została zwiększona  o 1 przy użyciu (++a)   i wynosi: " + temp);
        temp += 1;
        System.out.println("Liczba została zwiększona  o 1 przy użyciu (a+= 1) i wynosi: " + temp);
        temp = temp - 1;
        System.out.println("Liczba została zmniejszona o 1 przy użyciu (a=a-1) i wynosi: " + temp);
        --temp;
        System.out.println("Liczba została zmniejszona o 1 przy użyciu (--a)   i wynosi: " + temp);
        temp -= 1;
        System.out.println("Liczba została zmniejszona o 1 przy użyciu (a-= 1) i wynosi: " + temp);
    }
}