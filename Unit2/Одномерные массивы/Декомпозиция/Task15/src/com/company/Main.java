package com.company;
import java.util.*;
import java.util.ArrayList;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите число: ");
        int n = in.nextInt();
        int[] Array = new int[n];

        createArray(Array);
        System.out.println(" ");
        numbers(Array);
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

    public static void numbers(int [] Array){

        int tmp;
        int prev =0;
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i < Array.length; i++) {
            tmp = Array[i];
            while (tmp >= 1) {
                num.add(tmp % 10);
                tmp /= 10;
            }
            for (int j = 0; j < num.size(); j++){
                if(Array[i] < 10){
                    for (int l = 0; num.size() >= 1;) {
                        num.remove(l);
                    }
                } else {
                    for(int k = 0; k < num.size() -1; k++){
                        if(num.get(k) - num.get(k+1) == 1){
                            prev++;
                            if(num.size() - prev == 1){
                                System.out.println(Array[i]);
                            }
                        }
                    }
                    for (int l = 0; num.size() >= 1;) {
                        num.remove(l);
                        prev = 0;
                    }
                }
            }
        }
    }
}
