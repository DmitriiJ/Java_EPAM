package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "I have already written 10 letters for my grandma! " +
                "And each letter had over 1500 words!";
        char[] Array = str.toCharArray();                                     //делаем из строки массив символов

        for(char ch : Array){                                                 //пробегам по массиву и выводим каждый
            System.out.print(ch +""+ ch);                                     //символ дважды
        }
    }
}
