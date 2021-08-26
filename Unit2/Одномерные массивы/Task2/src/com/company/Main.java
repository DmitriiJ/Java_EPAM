package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        System.out.println("Введите число Z: ");
        double Z = in.nextDouble();

        int count = 0;
        double Array[] = new double[n];

        for(int i = 0; i < Array.length; i++){
            Array[i] = rand.nextInt((99) - 10);
        }

        for (int i = 0; i < Array.length; i++){
            Array[i] = Array[i] / 10;
            System.out.println(Array[i]);
        }
        System.out.println("   ");

        for(int i = 0; i < Array.length; i++){
            if(Array[i] > Z){
                Array[i] = Z;
                count++;
            }
            System.out.println(Array[i]);
        }
        System.out.println("Кол-во замен = " + count);
    }
}
