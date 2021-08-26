package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "I have already written 10 letters for my grandma! " +
                "And each letter had over 1500 words!";
        int count = 0;
        System.out.println(str);

        for (char ch : str.toCharArray()) {                                //строку разбиваем на символы и проверяем
            if(ch == 'a'){                                                 //если символ 'a', то увеличиваем счётчик
                count++;
            }
        }
        System.out.println("Символ 'a' встречается в строке " + count + " раз");
    }
}
