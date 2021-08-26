package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static final Scanner in = new Scanner(System.in);
    private static Random rand = new Random();
    public static void main(String[] args) {
        System.out.println("Количество столбцов не должно превышать количество строк!");
        System.out.println(" ");
        System.out.println("Введите кол-во строк массива: ");
        int n = in.nextInt();
        System.out.println("Введите кол-во столбцов массива: ");
        int m = in.nextInt();
        int tmp[] = new int[m];
        int Array[][] = new int[n][m];

        if(m > n){
            System.out.println("Количество столбцов не должно превышать количество строк!");
            return;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(j>=i){
                    Array[i][j] = 1;
                }
                    else{
                        Array[i][j] = 0;
                    }
            }
        }

        for(int i = 0; i < m; i++){
            tmp[i] = Array[0][i];
            Array[0][i] = Array[m-1][i];
            Array[m-1][i] = tmp[i];
            }


        if(m > 5 && n > 5) {
            for (int i = 0; i < m; i++) {
                tmp[i] = Array[4][i];
                Array[4][i] = Array[3][i];
                Array[3][i] = tmp[i];
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

