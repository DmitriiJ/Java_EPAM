package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите предел a: ");
        int a = in.nextInt();
        System.out.println("Введите предел b: ");
        int b = in.nextInt();
        System.out.println("Введите шаг h: ");
        int h = in.nextInt();
        int x;

        while(a <= b){
            x = a;
            a += h;
            if(x > 2){
                System.out.println(x);
            } else{
                System.out.println(x * (-1));
            }
        }
    }
}
