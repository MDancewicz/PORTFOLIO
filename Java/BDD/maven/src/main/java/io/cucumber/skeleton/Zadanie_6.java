package io.cucumber.skeleton;

import java.util.Scanner;

public class Zadanie_6 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();
        int[] board = {25, 32, 40, 555, 86, -87, 8, -9, 100};
        System.out.println("Tablica składa się z liczb:");
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i] + " ");
        }
        int start = 0;
        int end = board.length - 1;
        while (start < end) {
            int temp = board[start];
            board[start] = board[end];
            board[end] = temp;
            start++;
            end--;
        }
        System.out.println("\nTablica po zmianie miejsc składa się z liczb:");
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i] + " ");
        }
    }
}