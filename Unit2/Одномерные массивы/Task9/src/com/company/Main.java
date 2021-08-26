package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Random rand = new Random();
    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int count = 0, maxcount = 0, m = 0;

        int Array1[] = new int[n];

        for (int i = 0; i < Array1.length; i++) {
        Array1[i] = rand.nextInt((99) - 90);
        }

        Arrays.sort(Array1);

        for (int i = 0; i < Array1.length; i++) {
            System.out.println(i + ".  " + Array1[i]);
        }
        System.out.println("   ");

        for(int i = 0; i < Array1.length; i++){
            for (int j = 0; j < Array1.length; j++){
                if(Array1[i] == Array1[j]){
                    count++;
                }
            }
            if(maxcount < count){
                maxcount = count;
                m = Array1[i];
            }
            count = 0;
        }
            System.out.println(m);
    }
}