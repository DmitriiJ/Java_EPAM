package com.company;

public class Main {

    public static void main(String[] args) {

        String[] Array = {"казак", "шалаш", "потоп", "дед", "лёд", "мадам", "причал"};

        for (int i = 0; i < Array.length; i++){                            //печатаем строчный массив
            System.out.print(Array[i] + ", ");
        }
        System.out.println(" ");

        for (int i = 0; i < Array.length; i++){
            if(Array[i].equals(new StringBuilder(Array[i]).reverse().toString())){    //проверяем каждый элемент массива
                System.out.println("Слово '" + Array[i] +"' является палиндромом!");        //если перевёрнутое слово
            } else System.out.println("Слово '" + Array[i] + "' не является палиндромом!"); //совпадает с исходным
        }                                                                                 //то оно является палиндромом
    }                                                                                     //если нет, то пишем об этом
}
