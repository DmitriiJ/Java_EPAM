package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int Arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("Введите число K: ");
        int K = in.nextInt();
        int sum = 0;

        for(int i = 0; i < Arr.length; i++){
            if((Arr[i] % K) == 0){
                sum += Arr[i];
            }
        }
        System.out.println("Сумма = " + sum);
    }
}
