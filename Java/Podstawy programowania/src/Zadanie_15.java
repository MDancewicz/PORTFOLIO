import java.util.Scanner;
public class Zadanie_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wiek ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Jesteś pełnoletni.");
        } else {
            System.out.println("Nie jesteś pełnoletni.");
        }
    }
}