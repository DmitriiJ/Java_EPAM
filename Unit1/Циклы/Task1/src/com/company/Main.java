package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите любое целое положительное число: ");
        int a = in.nextInt();
        int res = 0;

        while (a != 0){
            res += a;
            a--;
        }
        System.out.println(res);
    }
}
