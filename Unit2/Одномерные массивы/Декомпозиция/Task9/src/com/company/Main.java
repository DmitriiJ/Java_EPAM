package com.company;
import java.util.Scanner;

public class Main {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите сторону X: ");
        int x = in.nextInt();
        System.out.println("Введите сторону Y: ");
        int y = in.nextInt();
        System.out.println("Введите сторону Z: ");
        int z = in.nextInt();
        System.out.println("Введите сторону T: ");
        int t = in.nextInt();

        double s1 = (x * y) / 2;
        double diagonal = Math.sqrt(x*x + y*y);
        double p = (z + t + diagonal) / 2;
        double s2 = Math.sqrt(p*(p-z)*(p-t)*(p-diagonal));
        double S = s1 + s2;

        System.out.print("Площадь фигуры: " + S);
    }
}
