package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите размерность массива: ");
        double n = in.nextDouble();
        int count = 0;

        double Array[][] = new double[(int) n][(int) n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if(Array[i][j] > 0){
                    count++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.printf("Кол-во положительных элементов: %d", count);
    }
}
