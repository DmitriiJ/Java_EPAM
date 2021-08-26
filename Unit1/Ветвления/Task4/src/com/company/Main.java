package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите ширину отверстия А: ");
        int A = in.nextInt();
        System.out.println("Введите высоту отверстия B: ");
        int B = in.nextInt();

        System.out.println("Введите длину кирпича x: ");
        int x = in.nextInt();
        System.out.println("Введите ширину кирпича y: ");
        int y = in.nextInt();
        System.out.println("Введите высоту кирпича z: ");
        int z = in.nextInt();

        if(z < A && y < B || z < B && y < A){
            System.out.println("Кирпич проходит через отверстие!");
        } else if(x < A && y < B || x < B && y < A){
            System.out.println("Кирпич проходит через отверстие!");
        } else {
            System.out.println("Кирпич НЕ проходит через отверстие!");
        }

    }
}
