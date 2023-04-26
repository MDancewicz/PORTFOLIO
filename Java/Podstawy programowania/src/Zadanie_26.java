import java.util.Scanner;

public class Zadanie_26 {
    public static void main(String[] args) {
        System.out.print("Podaj liczbę = ");
        Scanner scanner1 = new Scanner(System.in);
        int x = scanner1.nextInt();
        if (x % 3 == 0) {
            System.out.print("fizz");
        }
        if (x % 5 == 0) {
            System.out.print("buzz");
        }
    }
}
