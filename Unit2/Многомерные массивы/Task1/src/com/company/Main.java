package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Random rand = new Random();
    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        int n = in.nextInt();

        int Array1[][] = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                Array1[i][j] = rand.nextInt((99) - 90);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Array1[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for (int i = 0; i < n; ++i) {
            for (int j = 1; j < n; j+=2) {
                if(Array1[0][j] > Array1[n - 1][j]){
                    System.out.print(Array1[i][j] + " ");
                }
            }

        }
    }
}
