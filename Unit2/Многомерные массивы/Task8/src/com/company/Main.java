package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Random rand = new Random();
    public static void main(String[] args) {
        System.out.println("Введите кол-во строк массива: ");
        int n = in.nextInt();
        System.out.println("Введите кол-во столбцов массива: ");
        int m = in.nextInt();

        int Array[][] = new int[n][m];
        int tmp = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                Array[i][j] = rand.nextInt((99) - 90);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Введите номер первого столбца: ");
        int indexRow1 = in.nextInt();
        System.out.println("Введите номер второго столбца: ");
        int indexRow2 = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(j == indexRow1){
                    tmp = Array[i][indexRow2];
                    Array[i][indexRow2] = Array[i][indexRow1];
                    Array[i][indexRow1] = tmp;
                }
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
