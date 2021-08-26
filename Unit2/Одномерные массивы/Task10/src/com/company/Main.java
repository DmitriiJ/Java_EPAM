package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Random rand = new Random();
    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int x = 1;

        int Array[] = new int[n];

        for (int i = 0; i < Array.length; i++) {
            Array[i] = rand.nextInt((99) - 10);
        }

        for (int i = 0; i < Array.length; i++) {
            System.out.println(i + ".  " + Array[i]);
        }
        System.out.println("   ");

        for (int i = 2; i < Array.length; i += 2) {
            Array[x] = Array[i];                              //сжимаем массив
            x++;
        }

        if (n % 2 == 0) {
            for (int i = (n / 2); i < Array.length; i++) {
                Array[i] = 0;                                //зануляем свободные элементы для чётного кол-ва элементов
            }
        } else {
            for (int i = (n / 2) + 1; i < Array.length; i++) {
                Array[i] = 0;
            }                                                                   //для нечётного
        }

            for (int i = 0; i < Array.length; i++) {
                System.out.println(i + ".  " + Array[i]);
            }
        }
    }