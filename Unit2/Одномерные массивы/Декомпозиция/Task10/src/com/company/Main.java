package com.company;
import java.util.Scanner;

public class Main {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите число: ");
        String x = in.nextBigInteger().toString();
        char [] Array = x.toCharArray();

        for (int i = 0; i < Array.length; i++){
            System.out.print(Array[i] + " ");
        }
    }
}
