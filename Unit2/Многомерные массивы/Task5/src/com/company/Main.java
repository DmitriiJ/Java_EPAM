package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите размерность массива(чётн.): ");
        int n = in.nextInt();
        int numberStr = 0, numberStolb = n;

        if ((n % 2) != 0){
            System.out.println("Размерность нечётная!");
            return;
        }

        int Array[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            numberStr++;
            for (int j = 0; j < n; j++) {
                Array[i][j] = numberStr;
            }
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = n - 1; j > n - i - 1; j--) {
                Array[i][j] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
