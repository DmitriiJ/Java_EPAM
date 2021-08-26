package com.company;

public class Main {

    public static void main(String[] args) {

        int[] Array = new int[]{1, 3, 5, 7, 9};

        System.out.print("Сумма факториалов: " + getFactorial(Array));
    }

    public static int getFactorial(int[] Array){
        int res;
        int sum = 0;

        for(int i = 0; i < Array.length; i++){
            res = 1;
            for(int j = 1; j <= Array[i]; j++){
                res = res * j;
            }
            sum += res;
        }
        return sum;
    }
}
