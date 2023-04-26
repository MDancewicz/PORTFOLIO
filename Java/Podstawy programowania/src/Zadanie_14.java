import java.util.Scanner;
public class Zadanie_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wage (kg) ");
        double weight = scanner.nextDouble();
        System.out.print("Podaj wzrost (m) ");
        double height = scanner.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        System.out.println("Twoje BMI wynosi: " + bmi);
        if (bmi <= 24.9 && bmi >= 18.5) {
            System.out.println("Masz prawidłową wage");
        } else if (bmi > 24.9) {
            System.out.println("Masz nadwage");
        } else
            System.out.println("Masz niedowage");
    }
}