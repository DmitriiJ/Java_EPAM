package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static final Scanner in = new Scanner(System.in);
    private static Random rand = new Random();
    public static void main(String[] args) {

        System.out.println("Введите размерность массива: ");
        int n = in.nextInt();
        int [] Array = new int[n];
        int max = 0;
        int preMax = 0;

        for(int i = 0; i < Array.length; i++){
            Array[i] = rand.nextInt((10) - 1);
        }

        for (int i = 0; i < Array.length; i++){
            System.out.print(Array[i] + " ");
        }
        System.out.println("   ");

        for(int i = 0; i < Array.length; i++){
            if(preMax < Array[i] && Array[i] < MAX(Array, max)){
                preMax = Array[i];
            }
        }
        System.out.print("Второе по величине число в массиве: " + preMax);
    }


    public static int MAX(int [] Array, int max){

        for(int i = 0; i < Array.length; i++){
            if(Array[i] > max){
                max = Array[i];
            }
        }
        return max;
    }
}
