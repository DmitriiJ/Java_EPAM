package com.company;
import java.util.Arrays;
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

        int Array[] = new int[n];
        int Array1[] = new int[m+n];

        System.out.println("   ");
        System.out.println("Первый массив: ");

        for (int i = 0; i < n; i++) {
            Array[i] = rand.nextInt((10));
        }
        Arrays.sort(Array);

        for (int i = 0; i < n; i++) {
            System.out.println(Array[i]);
        }
        System.out.println("   ");



        System.out.println("Второй массив: ");

        for (int i = 0; i < m; i++) {
            Array1[i] = rand.nextInt((10) + rand.nextInt(10));
        }
        Arrays.sort(Array1);

        for (int i = 0; i < m; i++) {
            System.out.println(Array1[i]);
        }
        System.out.println("   ");


        System.arraycopy(Array, 0, Array1, m, n);
        System.out.println("Получившийся массив: ");
        Arrays.sort(Array1);

        for (int i = 0; i < m+n; i++) {
            System.out.println(Array1[i]);
        }
        System.out.println("   ");
    }
}