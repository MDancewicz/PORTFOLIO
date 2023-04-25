import java.util.Scanner;
public class Zadanie_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int max = 0;
        int min = 0;
        int number;
        do {
            System.out.print("Podaj liczbę: ");
            number = scanner.nextInt();
            sum += number;
            if (max < number) {
                max = number;
            }
            if (min > number) {
                min = number;
            }
        } while (number != 0);
        System.out.println("Suma podanych liczb: " + sum);
        System.out.println("Największa podana liczba: " + max);
        System.out.println("Największa podana liczba: " + min);
    }
}