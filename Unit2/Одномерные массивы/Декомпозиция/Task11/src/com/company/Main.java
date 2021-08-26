package com.company;
import java.util.Scanner;

public class Main {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите первое число: ");
        String x = in.nextBigInteger().toString();
        char [] Array1 = x.toCharArray();

        System.out.println("Введите второе число: ");
        String y = in.nextBigInteger().toString();
        char [] Array2 = y.toCharArray();

        comparison(Array1, Array2);
    }

    public static void comparison(char[] Array1, char [] Array2){
        int count1 = 0, count2 = 0;

        for (int i = 0; i < Array1.length; i++){
            count1++;
        }

        for (int i = 0; i < Array2.length; i++){
            count2++;
        }

        if(count1 > count2){
            System.out.print("В числе 1 цифр больше!");
        } else if(count2 > count1){
            System.out.print("В числе 2 цифр больше!");
        } else System.out.print("В числах равное количество цифр!");
    }
}
