package com.company;
import java.util.Scanner;

public class Main {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int [] Array = new int[3];
        int nod = 0;
        System.out.println("Введите числа: ");

        for(int i = 0; i < Array.length; i++){
            Array[i] = in.nextInt();
        }

        for(int i = 0; i < Array.length; i++){
            if(i+1 < Array.length){
                for (int j = i + 1; j <= i + 1; j++){
                    nod = NOD(Array[i], Array[j]);
                }
                Array[i+1] = nod;
            }
        }

        if(nod == 1){
            System.out.print("Числа взаимно простые!");
        } else System.out.print("Числа НЕ являются взаимно простыми!");
    }

    public static int NOD (int a, int b){
        if(b == 0){
            return a;
        } else return NOD(b, a % b);
    }
}