package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите предел m: ");
        int m = in.nextInt();
        System.out.println("Введите предел n: ");
        int n = in.nextInt();

        for(int i = m; i <= n; i++){
            for (int a = 2; a < i; a++){
                if(i % a == 0){
                    System.out.printf("Число: %d  Делитель: %d  ", i, a);
                    }
                }
            }
        }

}
