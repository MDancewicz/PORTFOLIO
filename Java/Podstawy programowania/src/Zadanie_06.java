public class Zadanie_06 {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        int c = 12;
        int sum = a + b + c;
        int temp = sum + a;
        System.out.println("Podpunkt a) " + temp);
        temp = sum * b;
        System.out.println("Podpunkt b) " + temp);
        temp = -sum;
        System.out.println("Podpunkt c) " + temp);
        temp = a;
        a = b;
        b = temp;
        System.out.println("Podpunkt d) " + "a=" + a + " b=" + b);
    }
}