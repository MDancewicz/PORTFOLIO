package io.cucumber.skeleton;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
//        System.out.print("Podaj liczbę x: ");
//        Scanner scanner1 = new Scanner(System.in);
//        double x = scanner1.nextInt();
//        System.out.print("Podaj liczbę y: ");
//        Scanner scanner2 = new Scanner(System.in);
//        double y = scanner2.nextInt();
//        System.out.println("Suma = " + (x + y));
//        System.out.println("Różnica = " + (x - y));
//        System.out.println("Iloczyn = " + (x * y));
//        System.out.println("Iloraz = " + (x / y));
//        System.out.println('\u03A5');

        Osoba osoba1 = new Osoba();
        osoba1.name = "Michał";
        osoba1.age = 31;
        Osoba osoba2 = new Osoba();
        osoba2.name="Kasia";
        osoba2.age=30;
        osoba1.introduceYourself();
        osoba2.introduceYourself();
        osoba1.cheangeName("Maciej");
        osoba1.introduceYourself();
        ArrayList<String> names = new ArrayList<String>();

    }
}
