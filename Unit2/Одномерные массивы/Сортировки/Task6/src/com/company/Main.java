package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        int n = in.nextInt();

        int Array[] = new int[n];

        System.out.println("   ");
        System.out.println("Исходный массив: ");

        for (int i = 0; i < n; i++) {
            Array[i] = rand.nextInt((10));
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Array[i]);
        }
        System.out.println("   ");

            int h = 1;
            while (h*3 < Array.length)
                h = h * 3 + 1;

            while(h >= 1) {
                hSort(Array, h);
                h = h/3;
            }

        System.out.println("Получившийся массив: ");
        for (int i = 0; i < n; i++) {
            System.out.println(Array[i]);
        }
        System.out.println("   ");
    }

    private static void hSort(int [] Array, int h) {
        int length = Array.length;
        int current;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (Array[j] < Array[j - h]){
                    current = Array[j];
                    Array[j] = Array[j - h];
                    Array[j - h] = current;
                }
                else
                    break;
            }
        }
    }
}
