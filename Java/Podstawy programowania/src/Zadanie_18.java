import java.util.stream.IntStream;
import java.util.stream.Collectors;
public class Zadanie_18 {
    public static void main(String[] args) {
        System.out.println("Podpunkt a)");
        for (int i = 1; i <= 10; ++i) {
            System.out.print(i + " ");
        }
        System.out.println("\nPodpunkt b)");
        for (int i = 99; i >= 66; --i) {
            System.out.print(i + " ");
        }
        System.out.println("\nPodpunkt c)");
        String result = IntStream.iterate(20, i -> i + 2)
                .limit(11)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.print(result);
        System.out.println("\nPodpunkt d)");
        for (int i = 1; i <= 5; ++i) {
            System.out.print(i + ".Michał ");
        }
    }
}