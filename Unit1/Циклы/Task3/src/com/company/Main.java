package com.company;

public class Main {

    public static void main(String[] args) {

        int q;
        int a = 100;
        int res = 0;

        while (a != 0){
            q = a * a;
            res += q;
            a--;
        }
        System.out.println(res);
    }
}