package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите значение угла a в градусах: ");
        int a = in.nextInt();
        System.out.println("Введите значение угла b в градусах: ");
        int b = in.nextInt();

        if((a + b) < 180){
            System.out.println("Такой треугольник существует");
            if((a + b) == 90 || a == 90 || b == 90){
                System.out.println("И данный треугольник прямоугольный");
            } else {
                System.out.println("И данный треугольник НЕ прямоугольный");
            }
        } else {
            System.out.println("Такого треугольника не существует");
        }

    }
}
