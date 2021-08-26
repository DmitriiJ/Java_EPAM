package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {

        System.out.println("Введите размер первого массива: ");
        int n = in.nextInt();
        System.out.println("Введите размер второго массива: ");
        int m = in.nextInt();
        System.out.println("Введите число k: ");
        int k = in.nextInt();

        int Array[] = new int[n+m];
        int Array1[] = new int[m+n];

        System.out.println("   ");
        System.out.println("Первый массив: ");

        for(int i = 0; i < n; i++){
            Array[i] = rand.nextInt((10));
            System.out.println(Array[i]);
        }
        System.out.println("   ");

        System.out.println("Второй массив: ");
        for(int i = 0; i < m; i++){
            Array1[i] = rand.nextInt((10));
            System.out.println(Array1[i]);
        }
        System.out.println("   ");

        System.arraycopy(Array1, k, Array1, k+n, m-k);
        System.arraycopy(Array, 0, Array1, k+1, n);

        System.out.println("Получившийся массив: ");
        for(int i = 0; i < Array1.length; i++){
            System.out.println(Array1[i]);
        }
        System.out.println("   ");

    }
}
