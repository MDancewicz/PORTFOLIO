package io.cucumber.skeleton;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

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
