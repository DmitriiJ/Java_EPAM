package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int max = 0, tmpSum;

        int Array[] = new int[2*n];
        int newArray[] = new int[n+1];

        for(int i = 0; i < Array.length; i++){
            Array[i] = rand.nextInt((99) - 10);
            System.out.print(Array[i] + " ");
        }
        System.out.println("   ");
        System.out.println("Суммы:  ");

        for(int i = 0, j = 2*n-1; i < n; i++, j--){
            tmpSum = Array[i] + Array[j];
            newArray[i] = tmpSum;
            System.out.println(tmpSum);
        }

        for(int i = 0; i < newArray.length; i++){
            if(newArray[i] > max){
                max = newArray[i];
            }
        }
        System.out.println("Максимальная сумма: ");
        System.out.print(max);
    }
}
