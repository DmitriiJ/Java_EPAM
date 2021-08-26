package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Random rand = new Random();
    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        int n = in.nextInt();

        int Array[][] = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                Array[i][j] = rand.nextInt((99) - 90);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Главная диагональ:");
        for(int i = 0; i < n; i++){
            System.out.print(Array[i][i] + " ");
        }

        System.out.println(" ");
        System.out.println("Побочная диагональ:");
        for(int i = 0; i < n; i++){
            System.out.print(Array[i][n - 1 - i] + " ");
        }
    }
}
