package com.company;
import java.util.Scanner;

public class Main {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите сторону шестиугольника: ");
        int x = in.nextInt();

        Area(x);
        System.out.println("Площадь шестиугольника: ");
        System.out.print(Area(x) * 6);
    }

    public static double Area(int a){
        double S3 = a*a*Math.sqrt(3)/4;
        return S3;
    }
}
