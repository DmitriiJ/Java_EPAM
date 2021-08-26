package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите значение a: ");
        double a = in.nextDouble();

        System.out.println("Введите значение b: ");
        double b = in.nextDouble();

        System.out.println("Введите значение c: ");
        double c = in.nextDouble();

        double z = ((a - 3) * b / 2) + c;

        System.out.println(z);
    }
}
