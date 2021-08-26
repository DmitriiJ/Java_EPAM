package com.company;

public class Main {

    public static void main(String[] args) {

        String str = " I have already written    10 letters for my grandma! " +
                "And each letter         had over 1500 words! ";
        int count = 0, max = 0;

        char[] Array = str.toCharArray();                //делаем из строки массив символов

        for (int i = 0; i < Array.length; i++){          //проходим по всему массиву
            if(Array[i] == ' '){                         //если встречается пробел, то увеличиваем счётчик на 1
                count++;
            } else if(count > max) {                     //находим максимальное кол-во подряд идущих пробелов
                max = count;                             //и сохраняем это число в отдельную переменную
                count = 0;
            } else count = 0;

            System.out.print(Array[i]);
        }
        System.out.println(" ");
        System.out.print("Наибольшая очередь из пробелов: " + max);  //выводим результат
    }
}
