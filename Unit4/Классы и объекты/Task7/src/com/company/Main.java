package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        boolean play = true;
        Triangle triangle = new Triangle();

        while (play){
            menu();
            int n = in.nextInt();
            switch (n){
                case 1:
                    triangle.createTriangle(triangle.lines);
                    break;
                case 2:
                    triangle.findSquareOfTriangle(triangle.lines);
                    break;
                case 3:
                    triangle.perimeter(triangle.lines);
                    break;
                case 4:
                    triangle.medianIntersectionPoint(triangle.lines);
                    break;
                case 5:
                   play = false;
            }
        }
    }

    //вывод пунктов меню
    public static void menu(){
        System.out.println(" ");
        System.out.println("Выберите пункт меню: ");
        System.out.println("1. Создать треугольник");
        System.out.println("2. Вычислить площадь треугольника");
        System.out.println("3. Вычислить периметр треугольника");
        System.out.println("4. Найти точку пересечения медиан");
        System.out.println("5. Выход");
    }
}
