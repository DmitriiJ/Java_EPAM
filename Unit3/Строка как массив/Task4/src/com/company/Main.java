package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String str = "I have already written 10 letters for my grandma! " +
                "And each letter had over 1500 words!";
        int count = 0;
        System.out.println(str);
        Pattern p = Pattern.compile("(\\d+)");          //задаём шаблон для поиска чисел в строке
        Matcher m = p.matcher(str);

        while (m.find()){                              //если число найдено, то увеличиваем счётчик на 1
            count++;
        }
        System.out.print("Кол-во чисел в строке: " + count);
    }
}
