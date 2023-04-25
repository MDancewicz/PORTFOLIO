public class Zadanie_20 {
    public static void main(String[] args) {
        int[] board = {25, 32, 40, 555, 86, -87, 8, -9, 100};
        int max = board[0];
        int min = board[0];
        System.out.print("Tablica składa się z liczb: ");
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i] + " ");
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i] > max) {
                max = board[i];
            }
            if (board[i] < min) {
                min = board[i];
            }
        }
        System.out.println("\nNajwiększa  liczba w tablicy to: "+max);
        System.out.print("Najmniejsza liczba w tablicy to: "+min);
    }
}