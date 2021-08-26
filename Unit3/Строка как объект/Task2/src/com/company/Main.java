package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "I have already written 10 letters for my grandma! " +
                "And each letter had over 1500 words!";

        for(char ch : str.toCharArray()){                      //делаем из строки массив символов
            if(ch == 'a'){                                     //если символ буква а,
                System.out.print(ch + "b");                    //то перед ним вставляем букву b
            } else System.out.print(ch);
        }
    }
}
