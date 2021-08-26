package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int temp;
        boolean isSimple = true;
        double sum = 0;

        double Array[] = new double[n];


        for (int i = 0; i < Array.length; i++) {
            Array[i] = rand.nextInt((99) - 10);
        }


        for (int i = 0; i < Array.length; i++) {
            Array[i] = Array[i] / 10;
            System.out.println(i + ". " +Array[i]);
        }
        System.out.println("   ");


        for (int i = 2; i < Array.length; i++) {
            for (int j = 2; j <= i / 2; j++) {
                temp = i % j;
                if (temp == 0) {
                    isSimple = false;
                    break;
                }else{
                    isSimple = true;
                }
            }
            if (isSimple) {
                sum += Array[i];
            }
        }
        System.out.println(sum);
    }
}
