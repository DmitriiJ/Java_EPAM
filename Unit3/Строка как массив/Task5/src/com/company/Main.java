package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String str = " I have already written       10 letters for my grandma! " +
                "And each letter         had over 1500 words! ";
        boolean nothingDelete = true;
        int last;
        System.out.println(str);

        List<Character> chars = new ArrayList<>();

        for (char ch : str.toCharArray()) {            //записываем в List все символы строки
            chars.add(ch);
        }

        while (nothingDelete){
            nothingDelete = false;
            for(int i = 0; i < chars.size() - 1; i++){                                   //проходим по циклу и удаляем
                if(chars.get(i) == ' ' && chars.get(i+1) == ' ' || chars.get(0) == ' '){ //все лишние пробелы и пробел,
                    chars.remove(i);                                                     //если он стоит в начале строки
                    nothingDelete = true;
                }
            }
        }

        last = chars.size();
        if(chars.get(chars.size() - 1) == ' '){        //удаляем пробел, если он есть в конце строки
            chars.remove(last - 1);
        }

        for (char ch : chars) {                  //выводим результат
            System.out.print(ch);
        }

    }
}
