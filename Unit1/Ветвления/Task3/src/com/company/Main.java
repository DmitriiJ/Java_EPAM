package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int y;

        System.out.println("Введите координату x первой точки: ");
        int x1 = in.nextInt();
        System.out.println("Введите координату y первой точки: ");
        int y1 = in.nextInt();

        System.out.println("Введите координату x второй точки: ");
        int x2 = in.nextInt();
        System.out.println("Введите координату y второй точки: ");
        int y2 = in.nextInt();

        System.out.println("Введите координату x третьей точки: ");
        int x3 = in.nextInt();
        System.out.println("Введите координату y третьей точки: ");
        int y3 = in.nextInt();

        y = (((y2 - y1) * (x3 - x1)) / (x2 - x1)) + y1;

        if(y == y1){
            System.out.println("Точки расположены на одной прямой!");
        } else {
            System.out.println("Точки НЕ расположены на одной прямой");
        }
    }
}
