package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "Book tasks freedom climb fork";
        System.out.println(str);
        String[] words = str.split(" ");                          //разбиваем строку на массив из слов

        int max = 0;
        String maxLength = "";

        for (String w : words){                                         //перебираем элементы массива(слова)
            if(w.length() > max){                                       //находим максимальную длину и запоминаем
               max = w.length();
               maxLength = w;
            } else if(w.length() == max) return;                        //если обнаружилось, что слов с макс. длиной
        }                                                               //несколько, то прерываем выполнение программы
        System.out.println("Самое длинное слово: " + maxLength);
    }
}
