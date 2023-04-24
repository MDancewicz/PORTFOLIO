public class Zadanie_12 {
    public static void main(String[] args) {
        String sentence = "Jestem sobie mały miś, gruby miś. ";
        String sentenceA = sentence.toUpperCase();
        System.out.println("Podpunkt a) " + sentenceA + " (wyświetlenie)");
        int sentenceB = sentence.length();
        System.out.println("Podpunkt b) Długość zdania to " + sentenceB + " znaki.");
        char firstCharacter = sentence.charAt(0);
        char fifthCharacter = sentence.charAt(4);
        System.out.println("Podpunkt c) Pierwszy znak to „" + firstCharacter + "”" + " " + "natomiast piąty znak to „" + fifthCharacter + "”.");
        sentence = sentence.toUpperCase();
        System.out.println("Podpunkt d) " + sentence + " (nadpisanie)");
        String word = "NIE";
        sentence.contains(word);
        if (sentence.contains(word) == true) {
            System.out.println("Podpunkt e) Zdanie zawiera słowo „" + word + "”");
        } else {
            System.out.println("Podpunkt e) Zdanie niezawiera słowa „" + word + "”");
        }
        String temp = sentence.substring(4, 13);
        System.out.println("Podpunkt f) Znaki od 5 do 13 to: „" + temp + "”");
        temp = sentence.substring(7);
        System.out.println("Podpunkt g) Znaki od 7 do końca to: „" + temp + "”");
        String last = sentence.substring(sentence.length() - 1);
        System.out.println("Podpunkt h) Ostatni znak: „" + last + "”");
        System.out.println("Podpunkt i)");
        String repeat = sentence.repeat(10);
        System.out.println(repeat);
    }
}