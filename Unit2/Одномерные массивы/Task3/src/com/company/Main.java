package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        int n = in.nextInt();

        int countOtr = 0, countPol = 0, countNul = 0;
        double Array[] = new double[n];

        for (int i = 0; i < Array.length; i++){
            Array[i] = ((double) (Math.random() * 31) - 15);
            System.out.println(Array[i]);
        }
        System.out.println("   ");

        for(int i = 0; i < Array.length; i++){
            if(Array[i] < 0){
                countOtr++;
            } else if(Array[i] == 0){
                countNul++;
            }else {
                countPol++;
            }
        }
        System.out.println("Отрицательных чисел: " + countOtr);
        System.out.println("Положительных чисел: " + countPol);
        System.out.println("Нулевых значений: " + countNul);
    }
}
