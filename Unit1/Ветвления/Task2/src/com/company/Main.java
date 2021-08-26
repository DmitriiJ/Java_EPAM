package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите число a: ");
        int a = in.nextInt();
        System.out.println("Введите число b: ");
        int b = in.nextInt();
        System.out.println("Введите число c: ");
        int c = in.nextInt();
        System.out.println("Введите число d: ");
        int d = in.nextInt();

        if(a < b && c < d){
            if(a > c){
                System.out.println(a);
            } else{
                System.out.println(c);
            }
        } else if(b < a && d < c){
            if(b > d){
                System.out.println(b);
            } else{
                System.out.println(d);
            }
        } else if(b < a && c < d){
            if(b > c){
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        } else if(a < b && d < c){
            if(a > d){
                System.out.println(a);
            } else{
                System.out.println(d);
            }
        }
    }
}
