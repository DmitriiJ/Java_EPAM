package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "I have already written 10 letters for my grandma! " +
                "And each letter had over 1500 words!";
        int count = 0;
        System.out.println(str);

        for (char ch : str.toCharArray()){                              //строку разбиваем на символы и проверяем
            if(ch == '0' || ch == '1' || ch == '2' || ch == '3'         //каждый символ отдельно
                    || ch == '4'|| ch == '5'|| ch == '6'|| ch == '7'    //если он равен цифре, то увеличиваем
                    || ch == '8'|| ch == '9'){                          //счётчик на 1
                count++;
            }
        }
        System.out.print("Кол-во цифр в строке: " + count);
    }
}
