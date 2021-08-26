package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        BigInteger res = BigInteger.valueOf(1);

        for(int i = 2; i <= 200; i++){
            res = res.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(res);
    }
}

