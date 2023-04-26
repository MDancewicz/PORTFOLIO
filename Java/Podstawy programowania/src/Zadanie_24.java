import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Zadanie_24 {
    public static void main(String[] args) {
        ArrayList<Integer> collect = new ArrayList<>();
        int random;
        for (int i = 0; i <= 10; i++) {
            random = (int) (Math.random() * 1000) + 1;
            collect.add(random);
        }
        Collections.sort(collect);
        System.out.println("Podpunkt a) Cała tablica: \n" + collect + "\n");
        List<Integer> sort1 = collect.stream()
                .filter(x -> x > 100)
                .toList();
        System.out.println("Podpunkt b) Liczby większe niż 100: \n" + sort1 + "\n");
        List<Integer> sort2 = collect.stream()
                .filter(x -> x > 100)
                .filter(x -> x < 500)
                .toList();
        System.out.println("Podpunkt c) Liczby większe niż 100 i mniejsze  niż 500: \n" + sort2);
    }
}
