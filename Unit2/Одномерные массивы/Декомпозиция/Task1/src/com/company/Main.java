package com.company;
import java.util.Scanner;

public class Main {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите первое число: ");
        int x = in.nextInt();
        System.out.println("Введите второе число: ");
        int y = in.nextInt();

        NODandNOK(x, y);
    }

    public static void NODandNOK(int x, int y){
        int nod = x;
        int a = y;
        while (a !=0) {
            int tmp = nod % a;
            nod = a;
            a = tmp;
        }

        int nok = (x * y) / nod;
        System.out.print("НОД: ");
        System.out.println(nod);
        System.out.print("НОК: ");
        System.out.println(nok);
    }
}
