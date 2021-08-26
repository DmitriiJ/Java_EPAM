package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int count = 0, min = 100;
        int Array[] = new int[n];

        for(int i = 0; i < Array.length; i++){
            Array[i] = rand.nextInt((99) - 10);
            System.out.print(Array[i] + " ");
        }
        System.out.println("   ");

        for(int i = 0; i < Array.length; i++){
            if(min > Array[i]){
                min = Array[i];
            }
        }
        System.out.println("   ");

        for (int i = 0; i < Array.length; i++){
            if(Array[i] == min){
                count++;
            }
        }

        int newArray[] = new int[n - count + 1];

        for (int i = 0; i < Array.length; i++){
            if(Array[i] == min){
                continue;
            } else newArray[i] = Array[i];
            System.out.print(newArray[i] + " ");
        }
    }
}
