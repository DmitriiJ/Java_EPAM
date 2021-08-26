package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Main {

    private static final Scanner in = new Scanner(System.in);
    private static final Random rand = new Random();

    public static void main(String[] args) {

        System.out.println("Введите кол-во дробей: ");
        int n = in.nextInt();
        int nok = 0;

        int[] ArrayUp = new int[n];
        int[] ArrayDown = new int[n];

        System.out.println("Первоначальные дроби: ");

        for (int i = 0; i < n; i++) {
            ArrayUp[i] = rand.nextInt((10));
            if(ArrayUp[i] == 0){
                ArrayUp[i]++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ArrayUp[i]);
            System.out.print("   ");
        }
        System.out.println("   ");

        for (int i = 0; i < n; i++) {
            System.out.print("-");
            System.out.print("   ");
        }
        System.out.println("   ");

        for (int i = 0; i < n; i++) {
            ArrayDown[i] = rand.nextInt(10);
            if(ArrayDown[i] == 0){
                ArrayDown[i]++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ArrayDown[i]);
            System.out.print("   ");
        }
        System.out.println("   ");
        System.out.println("   ");

        System.out.print("Полученные дроби: ");

         NOK (ArrayDown, ArrayUp, n, nok);

    }

    public static void NOK (int [] ArrayDown, int [] ArrayUp, int n, int nok){

        int simple = 0;System.out.println("   ");
        int max = 0;

        for (int i = 0; i < n; i++){
            if(ArrayDown[i] > max){
                max = ArrayDown[i];
            }
        }

        while (nok == 0){
            for (int i = 0; i < n; i++) {
                if((max % ArrayDown[i]) != 0){
                    simple++;
                }
            }
            if(simple != 0){
                max++;
                simple = 0;
            } else nok = max;
        }
        System.out.println(" ");

        for (int i = 0; i < n; i++){
            ArrayUp[i] *= nok/ArrayDown[i];
        }

        for (int i = 0; i < n; i++){
            ArrayDown[i] = nok;
        }

        Arrays.sort(ArrayUp);
        for (int i = 0; i < n; i++) {
            System.out.print(ArrayUp[i]);
            System.out.print("   ");
        }
        System.out.println("   ");

        for (int i = 0; i < n; i++) {
            System.out.print("-");
            System.out.print("   ");
        } System.out.println("   ");

        for (int i = 0; i < n; i++) {
            System.out.print(ArrayDown[i]);
            System.out.print("   ");
        }
        System.out.println("   ");
    }
}

