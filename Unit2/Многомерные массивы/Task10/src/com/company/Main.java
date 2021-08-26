package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Random rand = new Random();
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        int n = in.nextInt();

        int Array[][] = new int[n][n];

        for (int i = 0; i < n / 2; i++){
            for (int j = 0; j < n; j++){
                Array[i][j] = rand.nextInt((99) - 90);
            }
        }

        for (int i = n / 2; i < n; i++){
            for (int j = 0; j < n; j++){
                Array[i][j] = rand.nextInt((99) - 90) * -1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        for(int i = 0; i < n; i++){
            if(Array[i][i] > 0) {
                System.out.print(Array[i][i] + " ");
            }
        }
    }
}
