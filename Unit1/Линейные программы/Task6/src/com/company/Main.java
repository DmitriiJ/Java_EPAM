package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите x координату точки: ");
        int x = in.nextInt();
        System.out.println("Введите y координату точки: ");
        int y = in.nextInt();

        if(y <= 0 && y >= -3 && x <= 4 && x >= -4 || y > 0 && y <= 4 && x <= 2 && x >= -2){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
