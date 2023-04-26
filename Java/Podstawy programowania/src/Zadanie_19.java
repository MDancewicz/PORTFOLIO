import java.util.Scanner;
public class Zadanie_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password = 123456;
        System.out.print("Podaj hasło (tylko liczby): ");
        int givenPpassword = scanner.nextInt();
        while (password != givenPpassword) {
            System.out.println("Hasło błędne, spróbuj ponownie.");
            System.out.print("Podaj hasło (tylko liczby): ");
            givenPpassword = scanner.nextInt();
        }
        System.out.print("Hasło poprawne.");
    }
}