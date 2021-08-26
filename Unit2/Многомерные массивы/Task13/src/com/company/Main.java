package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static final Scanner in = new Scanner(System.in);
    private static Random rand = new Random();
    public static void main(String[] args) {
        System.out.println("Введите кол-во строк массива: ");
        int n = in.nextInt();
        System.out.println("Введите кол-во столбцов массива: ");
        int m = in.nextInt();
        int tmp;
        int Array[][] = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                Array[i][j] = rand.nextInt((99) - 90);
                System.out.print(Array[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Столбцы по возрастанию:");
        for (int k = 0; k < m; k++){
            for (int i = 0; i < n - 1; i++){
                for (int j = 0; j < m; j++){
                    if(Array[i][j] > Array[i + 1][j]){
                        tmp = Array[i + 1][j];
                        Array[i + 1][j] = Array[i][j];
                        Array[i][j] = tmp;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(Array[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Столбцы по убыванию:");
        for (int k = 0; k < m; k++){
            for (int i = 0; i < n - 1; i++){
                for (int j = 0; j < m; j++){
                    if(Array[i][j] < Array[i + 1][j]){
                        tmp = Array[i][j];
                        Array[i][j] = Array[i + 1][j];
                        Array[i + 1][j] = tmp;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(Array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
