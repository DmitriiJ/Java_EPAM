package com.company;

import java.util.Scanner;

public class Counter {
    private static Scanner in = new Scanner(System.in);

    public Counter(){

        int count = 0;
        boolean isStart = true;

        while (isStart){
            menu();
            System.out.println("Выберите вариант: ");
            int number = in.nextInt();
            switch (number){
                case 1:
                    int[] rangeDef = new int[10];
                    fillingRangeDefault(rangeDef);
                    countingDef(rangeDef);
                    break;
                case 2:
                    System.out.println("Введите первую границу диапазона: ");
                    int a = in.nextInt();
                    System.out.println("Введите вторую границу диапазона: ");
                    int b = in.nextInt();

                    if(a == b){
                        System.out.println("Границы совпали!");
                        return;
                    }

                    int[] range = new int[lengthOfRange(a, b)];
                    fillingArray(range, a, b);
                    counting(range, a, b, count);
                    break;
                case 3:
                    isStart = false;
            }
        }

    }

    public int lengthOfRange(int a, int b){
        int n = b - a;
        return n + 1;
    }

    public void counting(int[] range, int a, int b, int count){

        int i = 0;
        char ch;
        boolean play = true;

        System.out.println("Введите '+', чтобы увеличить счётчик. " +
                "Введите '-', чтобы уменьшить счётчик. " +
                "Чтобы выйти, введите '='");
        System.out.println(range[0]);

        while (play){
            System.out.print("Сделайте выбор: ");
            ch = in.next().charAt(0);
            switch (ch){
                case '+':
                    if(i == lengthOfRange(a, b) - 1){
                        i = 0;
                        System.out.println("Текущее значение счётчика: " + range[i]);
                    }
                    i++;
                    System.out.println("Текущее значение счётчика: " + range[i]);
                    if(range[i] == b){
                        i = 0;
                        System.out.println("Текущее значение счётчика: " + range[i]);
                        break;
                    }
                    break;
                case '-':
                    if(i == 0){
                        i = lengthOfRange(a, b);
                    }
                    i--;
                    System.out.println("Текущее значение счётчика: " + range[i]);
                    if(range[i] == a){
                        i = lengthOfRange(a, b);
                        break;
                    }
                    break;
                case '=':
                    play = false;
            }
        }
    }

    public void fillingArray(int [] range, int a, int b){
        int a1 = a;
        for(int i = 0; a1 <= b; i++){
            range[i] = a1;
            a1++;
            System.out.print(range[i] + " ");
        }
    }

    public void fillingRangeDefault(int[] range){
        for (int i = 0; i < 10; i++){
            range[i] = i;
            System.out.print(range[i] + " ");
        }
    }

    public void countingDef(int[] rangeDef){

        int i = 0;
        char ch;
        boolean play = true;

        System.out.println("Введите '+', чтобы увеличить счётчик. " +
                "Введите '-', чтобы уменьшить счётчик. " +
                "Чтобы выйти, введите '='");
        System.out.println(rangeDef[0]);

        while (play){
            System.out.print("Сделайте выбор: ");
            ch = in.next().charAt(0);
            switch (ch){
                case '+':
                    if(i == 9){
                        i = 0;
                        System.out.println("Текущее значение счётчика: " + rangeDef[i]);
                    }
                    i++;
                    System.out.println("Текущее значение счётчика: " + rangeDef[i]);
                    if(rangeDef[i] == 9){
                        i = 0;
                        System.out.println("Текущее значение счётчика: " + rangeDef[i]);
                        break;
                    }
                    break;
                case '-':
                    if(i == 0){
                        i = 9;
                    }
                    i--;
                    System.out.println("Текущее значение счётчика: " + rangeDef[i]);
                    if(rangeDef[i] == 0){
                        i = 9;
                        break;
                    }
                    break;
                case '=':
                    play = false;
            }
        }
    }

    public void menu(){
        System.out.println("1. Проинициализировать счётчик значениями по умолчанию;");
        System.out.println("2. Проинициализировать счётчик своими значениями;");
        System.out.println("3. Выход.");
    }
}
