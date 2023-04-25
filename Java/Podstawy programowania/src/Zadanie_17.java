import java.util.Scanner;
public class Zadanie_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random() * 10) + 1;
        System.out.println("Wylosowana liczba: " + random);
        System.out.print("Pierwsza próba, zgadnij jaka to liczba (od 1 do 10): ");
        int number1 = scanner.nextInt();
        if (number1 == random) {
            System.out.println("Gratuluje, zgadłeś :)");
            System.exit(0);
        } else if (number1 < random && number1 >= 1 && number1 <= 10) {
            System.out.println("Pudło, szukana jest większa liczba, została jedna próba.");
        } else if (number1 > random && number1 >= 1 && number1 <= 10) {
            System.out.println("Pudło, szukana jest mniejsza liczba, została jedna próba.");
        } else {
            System.out.println("Zła liczba, została jedna próba.");
        }
        System.out.print("Ostatnia próba, zgadnij jaka to liczba (od 1 do 10): ");
        int number2 = scanner.nextInt();
        if (number2 == random) {
            System.out.println("Gratuluje, zgadłeś :)");
        } else if (number2 >= 1 && number2 <= 10) {
            System.out.println("Pudło, Game Over, szukaną liczbą była: " + random);
        } else {
            System.out.println("Zła liczba, Game Over, szukaną liczbą była: " + random);
        }
    }
}