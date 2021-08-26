package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите значение x: ");
        int x = in.nextInt();

        if(x <= 3){
            System.out.println(x*x - 3*x + 9);
        } else if(x > 3){
            System.out.println(1 / (Math.pow(x, 3) - 6));
        }
    }
}
