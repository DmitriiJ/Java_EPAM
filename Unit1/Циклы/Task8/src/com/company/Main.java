package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int c, d;

        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();

       while(a > 0){
           c = a % 10;
           a /= 10;
           d = b;
           while (d > 0){
               if((d % 10) == c){
                   System.out.println(c);
               }
               d /= 10;
           }
       }
    }
}
