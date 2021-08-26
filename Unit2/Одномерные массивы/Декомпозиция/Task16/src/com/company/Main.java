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
        checkNumbers(Array);
    }

    public static void createArray(int [] Array){

        int j = 100;
        for (int i = 0; i < Array.length; i++){
            Array[i] = j;
            j++;
        }

        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }

    public static void checkNumbers(int [] Array){

        int tmp, prev, tmpOdd, sum, copySum, count;
        ArrayList<Integer> OddNum = new ArrayList<>();

        for (int i = 0; i < Array.length; i++) {
            tmp = Array[i];
            if(tmp % 2 != 0){
                OddNum.add(tmp);
            }
        }
        System.out.println("Сумма нечётных чисел:");

        for(int i = 0; i < OddNum.size(); i++){

            sum = 0;
            tmpOdd = OddNum.get(i);
            while (tmpOdd >= 1) {
                sum += tmpOdd % 10;
                tmpOdd /= 10;
            }
            count = 0;
            copySum = sum;
            while (copySum >= 1){
                prev = copySum % 10;
                if(prev % 2 == 0){
                    count++;
                }
                copySum /= 10;
            }
            System.out.println(OddNum.get(i) +": "+ sum +". Количество чётных цифр в сумме: "+ count);
        }
    }
}
