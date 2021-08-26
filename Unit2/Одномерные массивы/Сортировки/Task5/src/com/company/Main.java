package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String a[]) {

        System.out.println("Введите размерность массива: ");
        int n = in.nextInt();
        int Array[] = new int[n];

        for (int i = 0; i < n; i++) {
            Array[i] = rand.nextInt((10));
        }

        System.out.println("Исходный массив: ");
        for (int i = 0; i < n; i++) {
            System.out.println(Array[i]);
        }
        System.out.println("   ");

        insertionSort(Array);

        System.out.println("Получившийся массив: ");
        for (int i = 0; i < n; i++) {
            System.out.println(Array[i]);
        }
        System.out.println("   ");
    }

    public static void insertionSort(int[] Array) {
        for (int i = 1; i < Array.length; i++) {
            int current = Array[i];
            int j = i - 1;
            while(j >= 0 && current < Array[j]) {
                Array[j+1] = Array[j];
                j--;
            }
            Array[j+1] = current;
        }
    }
}
