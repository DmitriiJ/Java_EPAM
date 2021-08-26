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

        int Array[] = new int[n+1];

        for(int i = 0; i < Array.length; i++){
            Array[i] = rand.nextInt(20);
        }

        Arrays.sort(Array);

        for (int i = 0; i < Array.length; i++){
            System.out.print(Array[i] + "-");
        }
        System.out.println("   ");

        interval(Array, n);
    }

    public static void interval(int [] Array, int n){

        int [] ArrInter = new int[n+1];

        for(int i = 0; i < n; i++){
            ArrInter[i] = Array[i+1] - Array[i];
        }
        System.out.println("   ");
        MAX(ArrInter, n);
    }

    public static void MAX(int [] ArrInter, int n){
        int max = 0;
        for(int i = 0; i < n; i++){
            if(ArrInter[i] > max){
                max = ArrInter[i];
            }
        }

        for(int i = 0; i < n; i++){
            if(ArrInter[i] == max){
                System.out.println("Наибольшее расстояние между точками под номерами: ");
                System.out.print(i + "-");
                System.out.println(i+1);
            }
        }
    }
}
