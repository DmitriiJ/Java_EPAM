package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int hours, min, sec;

        System.out.println("Введите время в секундах: ");
        int time = in.nextInt();

        hours = time / 3600;
        time %= 3600;

        min = time / 60;
        time %= 60;

        sec = time;

        System.out.printf("%dч:%dм:%dс", hours, min, sec);

    }
}
