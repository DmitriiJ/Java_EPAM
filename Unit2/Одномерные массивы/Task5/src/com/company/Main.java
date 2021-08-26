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

        for(int i = 0; i < Array.length; i++){
            Array[i] = rand.nextInt((10) - 1);
        }

        for (int i = 0; i < Array.length; i++){
            System.out.println(Array[i]);
        }
        System.out.println("   ");

        for(int i = 0; i < Array.length; i++){
            if(Array[i] > i){
                System.out.println(Array[i]);
            }
        }
    }
}
