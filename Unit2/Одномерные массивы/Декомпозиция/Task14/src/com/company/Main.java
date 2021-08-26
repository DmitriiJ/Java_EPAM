package com.company;
import java.util.*;
import java.util.ArrayList;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите число: ");
        int k = in.nextInt();
        int[] Array = new int[k];

        createArray(Array);
        System.out.println(" ");
        System.out.println("Числа Армстронга: ");
        searchArmstrong(Array);
    }

    public static void createArray(int [] Array){

        int j = 1;
        for (int i = 0; i < Array.length; i++){
            Array[i] = j;
            j++;
        }

        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }

    public static void searchArmstrong(int [] Array) {
        int tmp;
        int count = 0;
        int sum;
        ArrayList<Integer> Armstrong = new ArrayList<>();

        for (int i = 0; i < Array.length; i++) {
            sum = 0;
            count = 0;
            tmp = Array[i];
            while (tmp >= 1) {
                Armstrong.add(tmp % 10);
                tmp /= 10;
                count++;
            }
            for (int j = 0; j < Armstrong.size(); j++) {
                sum += Math.pow(Armstrong.get(j), count);
            }
            if (sum == Array[i]) {
                System.out.println(Array[i]);
                for (int l = 0; Armstrong.size() >= 1;) {
                    Armstrong.remove(l);
                }
            } else {
                for (int l = 0; Armstrong.size() >= 1;) {
                    Armstrong.remove(l);
                }
            }
        }
    }
}
