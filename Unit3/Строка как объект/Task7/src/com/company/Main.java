package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "abc cde def";
        System.out.println(str);                                       //выводим исходную строку на экран
        String res = new StringBuilder(str).reverse().toString();      //переворачиваем строку, чтобы оставить последнее
        res = res.replaceAll("(.)(?=.*\\1)", "");
        res = res.replaceAll(" ", "");                //вхождение символа в строку. Удаляем предыдущие
        res = new StringBuilder(res).reverse().toString();             //вхождения и переворачиваем строку обратно.
        System.out.print(res);                                         //удаляем пробелы и выводим результат на экран
    }
}
