import java.util.Scanner;

public class Zadanie_28 {
    public static void main(String[] args) {
        System.out.print("Podaj wysokość: ");
        Scanner scanner1 = new Scanner(System.in);
        int height = scanner1.nextInt();
        System.out.print("Co chcesz narysować (1=Choinka, 2=Klepsydra): ");
        Scanner scanner2 = new Scanner(System.in);
        int type = scanner2.nextInt();
        if (type == 2) {
            for (int i1 = 0; i1 < height; i1++) {
                for (int j1 = 0; j1 <= i1 - 1; j1++) {
                    System.out.print(" ");
                }
                for (int k1 = 0; k1 < height * 2 - 1 - i1 * 2; k1++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        if (type == 2 || type == 1) {
            for (int i2 = 1; i2 <= height; i2++) {
                for (int j2 = 0; j2 < height - i2; j2++) {
                    System.out.print(" ");
                }
                for (int k2 = 0; k2 < i2 * 2 - 1; k2++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Nie ma takiego typu.");
        }
    }

}