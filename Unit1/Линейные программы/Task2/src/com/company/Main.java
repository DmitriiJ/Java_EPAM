package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        byte pow = -2;

        System.out.println("Введите значение a: ");
        double a = in.nextDouble();

        System.out.println("Введите значение b: ");
        double b = in.nextDouble();

        System.out.println("Введите значение c: ");
        double c = in.nextDouble();

        System.out.println(((b + Math.sqrt(b*b + 4*a*c))/ (2*a)) - Math.pow(a, 3)*c + Math.pow(b, pow));


    }
}
