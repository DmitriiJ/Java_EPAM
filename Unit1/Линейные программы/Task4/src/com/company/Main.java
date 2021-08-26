package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

      System.out.println("Введите действительное число в формате nnn.ddd: ");
      double R = in.nextDouble();

      double Rn = Math.floor(R);
      int nnn = (int) Rn;

      double Rd = R - Rn;
      Rd *= 1000;
      int ddd = (int) Rd;

      System.out.print(ddd);
      System.out.print('.');
      System.out.print(nnn);
    }
}
