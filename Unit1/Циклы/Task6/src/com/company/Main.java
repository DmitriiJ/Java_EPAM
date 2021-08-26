package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("№  символ  OCT  HEX");

        for (int i = 33; i < 256; i++) {
            char symb = (char) i;

            String oct = Integer.toOctalString(i);
            String hex = Integer.toHexString(i);

            System.out.printf("%03d %3s %5s %4s%n", i, symb, oct, hex);
        }
    }
}


