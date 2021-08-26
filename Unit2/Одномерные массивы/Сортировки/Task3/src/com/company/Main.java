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
        boolean iter = true;
        int current = 0;

        int Array[] = new int[n];

        System.out.println("   ");
        System.out.println("Исходный массив: ");

        for (int i = 0; i < n; i++) {
            Array[i] = rand.nextInt((10));
        }
        Arrays.sort(Array);

        for (int i = 0; i < n; i++) {
            System.out.println(Array[i]);
        }
        System.out.println("   ");

       for (int max = 0; max < n-1; max++){
           current = max;
           for(int i = max + 1; i < n; i++){
               if(Array[i] > Array[current]){
                   current = i;
               }
               int tmp = Array[max];
               Array[max] = Array[current];
               Array[current] = tmp;
           }
       }
        System.out.println("Получившийся массив: ");
        for (int i = 0; i < n; i++) {
            System.out.println(Array[i]);
        }
        System.out.println("   ");
    }
}