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
            Array[i] = rand.nextInt(20);
        }

        for (int i = 0; i < Array.length; i++){
            System.out.print(Array[i] + " ");
        }
        System.out.println("   ");

        System.out.print(Summa(Array, n));
    }

    public static int Summa(int [] Array, int n) {
        System.out.println("Введите номер элемента: ");
        int m = in.nextInt();
        int sum;

        if(m == 0 || m == n){
            System.out.println("Вы выбрали крайний элемент!");
            return 0;
        } else if(m > n){
            System.out.println("Вы не попали в массив!");
            return 0;
        } else {
            sum = Array[m-1] + Array[m] + Array[m+1];
        }
        return sum;
    }
}
