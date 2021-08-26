package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static final Scanner in = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {
        int n = 10;
        int m = 20;
        int count = 0;
        int Array[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Array[i][j] = rand.nextInt((99) - 83);
                System.out.print(Array[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(Array[i][j] == 5){
                    count++;
                }
            }
                if(count >= 3){
                    System.out.println("Число 5 встречается три и/или более раза в строке №" + (i + 1));
                }
                count = 0;
        }
    }
}

