package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int current = 0;
        int count = 0;
        boolean iter = true;

        int Array[] = new int[n+1];

        System.out.println("   ");
        System.out.println("Исходный массив: ");

        for (int i = 0; i < n; i++) {
            Array[i] = rand.nextInt((10));
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Array[i]);
        }
        System.out.println("   ");

        while (iter){
            iter = false;
            for(int i = 0; i < n - 1; i++){
                if(Array[i] > Array[i+1]){
                    current = Array[i];
                    Array[i] = Array[i + 1];
                    Array[i + 1] = current;
                    count++;
                    iter = true;
                }
            }
        }
        System.out.println("Получившийся массив: ");
        for (int i = 0; i < n; i++) {
            System.out.println(Array[i]);
        }
        System.out.println("   ");
        System.out.println("Кол-во перестановок: " + count);
    }
}