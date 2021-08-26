package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "Информатика";
        char[] Array = new char[4];

        System.out.println("Исходное слово: " + str);

        str.getChars(3, 5, Array, 1);         //копируем нужные символы из исходного слова
        str.getChars(7, 8, Array, 0);         //в массив и выводим его на экран
        str.getChars(7, 8, Array, 3);

        System.out.print("Полученное слово: ");
        System.out.println(Array);
    }
}
