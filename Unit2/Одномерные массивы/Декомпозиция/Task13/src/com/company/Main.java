package com.company;
import java.util.*;
import java.util.ArrayList;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите число: ");
        int n = in.nextInt();
        int[] Array = new int[n+1];
        ArrayList<Integer> simple = new ArrayList<>();

        createArray(Array, n);
        System.out.println(" ");
        searchSimple(Array, simple);
        input(simple);
    }

    public static void createArray(int [] Array, int n){

        int j = n;
        for (int i = 0; i < Array.length; i++){
            Array[i] = j;
            j++;
        }

        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }

    public static void searchSimple(int [] Array, ArrayList<Integer> simple){

        int temp;
        boolean isSimple = true;

       for(int i = 0; i< Array.length; i++){
           isSimple = true;
           for(int s = 2; s <= Array[i] / 2; s++){
               temp = Array[i] % s;
               if(temp == 0){
                   isSimple = false;
                   break;
               }
           }
           if (isSimple == true){
               simple.add(Array[i]);
           }
       }

    }

    public static void input(ArrayList<Integer> simple) {
        for (int i = 0; i < simple.size() - 1; i++) {
            if (simple.get(i + 1) - simple.get(i) == 2) {
                System.out.println(simple.get(i) + " " + simple.get(i + 1));
            }
        }
    }
}
