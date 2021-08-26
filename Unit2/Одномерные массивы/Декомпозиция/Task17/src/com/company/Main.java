package com.company;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите число: ");
        int n = in.nextInt();
        int count = 0;
        int sum = 0;

        System.out.println(Summa(n, count, sum)+" раз(а) нужно отнять сумму цифр от числа, чтобы получился Null!");
    }

    public static int Summa(int n, int sum, int count) {

        int m = n;
        while (m >= 1) {
            sum += m % 10;
            m /= 10;
        }

        while (n > 0) {
            n -= sum;
            count++;
        }
        return count;
    }
}
