package io.cucumber.skeleton;

public class Osoba {

    String name;
    int age;

    public void introduceYourself() {
        System.out.println("Nazywam się " + name + " i mam " + age + " lat.");
    }

    public void cheangeName(String newName) {
        name = newName;
    }
}
