package io.cucumber.skeleton;

import java.util.Scanner;

public class Zadanie_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random() * 100) + 1;
        System.out.println("Wylosowana liczba: " + random);
        System.out.print("Podaj liczbę (od 1 do 100) = ");
        int number = scanner.nextInt();
        if (number == random) {
            System.out.println("Zgadłeś.");
        } else if (number < random && number <= 100 && number >= 1) {
            System.out.println("Szukana jest większa liczba.");
        } else if (number > random && number <= 100 && number >= 1) {
            System.out.println("Szukana jest mniejsza liczba.");
        } else {
            System.out.println("Podana liczba jest błędna.");
        }
    }
}
