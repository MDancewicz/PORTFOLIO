package io.cucumber.skeleton;

import java.util.Scanner;

public class Zadanie_1 {
    public static void main(String[] args) {
        System.out.print("Podaj liczbę x: ");
        Scanner scanner1 = new Scanner(System.in);
        int x = scanner1.nextInt();
        System.out.print("Podaj liczbę y: ");
        Scanner scanner2 = new Scanner(System.in);
        int y = scanner2.nextInt();
        System.out.println("Dodawanie = " + (x + y));
        System.out.println("Odejmowanie = " + (x - y));
        System.out.println("Mnożenie = " + (x * y));
        if (y == 0) {
            System.out.println("Dzielenie nie jest możliwe");
        } else {
            System.out.println("Dzielenie = " + (x / y));
        }
    }
}
