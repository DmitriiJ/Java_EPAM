package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {

        double min = 100;
        double max = 0;
        int indexMax = 0;
        int indexMin = 0;

        System.out.println("Введите размер массива: ");
        int n = in.nextInt();

        double Array[] = new double[n];

        for(int i = 0; i < Array.length; i++){
            Array[i] = rand.nextInt((99) - 10);
        }

        for (int i = 0; i < Array.length; i++){
            Array[i] = Array[i] / 10;
            System.out.println(Array[i]);
        }
        System.out.println("   ");

        for (int i = 0; i < Array.length; i++){
            if(Array[i] > max){
                max = Array[i];
                indexMax = i;
            }
        }

        for (int j = 0; j < Array.length; j++){
            if(Array[j] < min){
                min = Array[j];
                indexMin = j;
            }
        }

            double tmp = Array[indexMin];
            Array[indexMin] = Array[indexMax];
            Array[indexMax] = tmp;

        for (int i = 0; i < Array.length; i++){
           System.out.println(Array[i]);
        }
    }
}
