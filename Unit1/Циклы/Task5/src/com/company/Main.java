package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите число e: ");
        double e = in.nextDouble();
        double sum = 0;
        double a;
        int n = 0;

        do{
            a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
            n++;
            sum += a;
            System.out.println(a);
        } while (e <= Math.abs(a));
        System.out.println(a);
        System.out.println(sum);
    }
}
