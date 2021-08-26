package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите значение x: ");
        double x = in.nextDouble();

        System.out.println("Введите значение y: ");
        double y = in.nextDouble();

        System.out.println(((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x*y));
    }
}
