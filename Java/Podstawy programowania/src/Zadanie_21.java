import java.util.Scanner;
public class Zadanie_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        double givenNumber = scanner.nextDouble();
        int[] board = {25, 32, 40, 555, 86, -87, 8, -9, 100};
        for (int number : board) {
            if (number == givenNumber) {
                System.out.println("Podana liczba znajduje się w tablicy");
                System.exit(0);
            }
        }
        System.out.println("Podana liczba nie znajduje się w tablicy");
    }
}