package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "I have already written 10 letters for my grandma! " +
                "And each letter had over 1500 words!";
        System.out.println(str);
        str = str.replaceAll(" ", "");                              //удаляем из строки все пробелы,
        str = str.replaceAll("\\W", "");                            //знаки препинания и цифры,
        str = str.replaceAll("\\d", "");                            //чтобы была возможность считать
                                                                                     //только буквы
        int countUpper = 0, countLower = 0;
        char[] Array = str.toCharArray();                                         //разбиваем строку на массив символов

        for(char ch : Array){                                                     //проходим по массиву и считаем буквы
            if(Character.isUpperCase(ch)){
                countUpper++;
            } else countLower++;
        }

        System.out.println("Число прописных букв: " + countUpper);
        System.out.println("Число строчных букв: " + countLower);
    }
}
