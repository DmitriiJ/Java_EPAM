package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Integer> Array = new ArrayList<>();
        System.out.println("Введите число K: ");
        int K = in.nextInt();
        System.out.println("Введите число N: ");
        int N = in.nextInt();

        if (K == 0 || N == 0){
            System.out.print("Число должно быть натуральным!");
        }

        FormArray(Array, K, N);
    }

    public static void FormArray(ArrayList<Integer> Array, int K, int N) {

        int prev = 1;
        int sum = 0;

        if(N == 1){
            while (sum != K){
                Array.add(prev);
                sum += prev;
            }
        } else {
            while (sum != K){
                if(prev <= N && sum != K && sum < K){
                    Array.add(prev);
                    sum += prev;
                    prev++;
                } else {
                    prev--;
                    sum -= prev;
                    Array.remove(Array.size() - 1);
                    prev--;
                }
            }
        }

        System.out.print(Array);

    }
}
