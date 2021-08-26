package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Random rand = new Random();
    public static void main(String[] args) {

        System.out.println("Введите кол-во строк массива: ");
        int n = in.nextInt();
        System.out.println("Введите кол-во столбцов массива: ");
        int m = in.nextInt();

        int Array[][] = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                Array[i][j] = rand.nextInt((99) - 90);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Введите столбец массива: ");
        int k = in.nextInt();
        System.out.println("Введите строку массива: ");
        int p = in.nextInt();

        if (k > n || p > m){ System.out.println("Выход за пределы массива");}

        System.out.print("Столбец №" + k + ": ");
        for (int i = 0; i < n; i++){
            System.out.print(Array[i][k - 1] + " ");
        }

        System.out.println(" ");

        System.out.print("Строка №" + p + ": ");
        for (int j = 0; j < m; j++){
            System.out.print(Array[p - 1][j] + " ");
        }
    }
}
