public class Zadanie_05 {
    public static void main(String[] args) {
        byte a = 20;
        byte b = 5;
        byte c = 12;
        int sum = a + b + c;
        System.out.println("Suma liczb a=" + a + " b=" + b + " c=" + c + " wynosi=" + sum);
        int difference = a - b - c;
        System.out.println("Różnica liczb a=" + a + " b=" + b + " c=" + c + " wynosi=" + difference);
        int product = a * b * c;
        System.out.println("Iloczyn z a=" + a + " b=" + b + " c=" + c + " wynosi=" + product);
        int quotient = a / b;
        System.out.println("Iloraz z a=" + a + " b=" + b + " wynosi=" + quotient);
        int rest = a % b;
        System.out.println("Reszta z dzielenia liczb a=" + a + " b=" + b + " wynosi=" + rest);
    }
}