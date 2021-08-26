package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите размерность массива(чётная): ");
        int n = in.nextInt();

        if((n % 2) != 0){
            System.out.println("Размерность нечётная!");
        }

        int[][] Array = new int[n][n];

        for (int i = 0; i < n/2; i++) {

            for (int j = 0; j < n; j++) {

                if(i <= j && j <= n - i - 1)
                    Array[i][j] = 1;
                else
                    Array[i][j] = 0;

                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = n/2; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if(i >= j && j >= n - i - 1)
                    Array[i][j] = 1;
                else
                    Array[i][j] = 0;

                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}