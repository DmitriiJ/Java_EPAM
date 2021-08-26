package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите кол-во строк массива: ");
        int n = in.nextInt();
        System.out.println("Введите кол-во столбцов массива(чётное): ");
        int m = in.nextInt();

        if((m % 2) != 0){
            System.out.println("Нечётное кол-во столбцов");
            return;
        }

        int Array[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            int currentElementEven = 1;
            for (int j = 0; j < m; j++) {
                Array[i][j] = currentElementEven;
                currentElementEven++;
            }
        }

        for (int i = 1; i < n; i+=2) {
            int currentElementOdd = m;
            for (int j = 0; j < m; j++) {
                Array[i][j] = currentElementOdd;
                currentElementOdd--;
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
