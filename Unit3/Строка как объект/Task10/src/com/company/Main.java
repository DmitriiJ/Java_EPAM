package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "I have already written 10 letters for my grandma. " +
                "And each letter had over 1500 words! Do you like it?";
        System.out.println(str);

        char[] Array = str.toCharArray();                                       //разбиваем строку на массив символов
        int count = 0;

        for (char ch : Array){                                            //проходим по всему массиву и считаем символы,
            if(ch == '.' || ch == '!' || ch == '?'){                      //которыми заканчиваются предложения
                count++;
            }
        }
        System.out.println("Кол-во предложений: " + count);
    }
}
