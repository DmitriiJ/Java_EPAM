package com.company;

public class Main {

    public static void main(String[] args) {

        String[] Array = {"CamelArray", "classOfArrays", "digitalType"};
        boolean isUpper;

        for(String word : Array){         //вывод слов на экран
            System.out.println(word);
            char[] chArray = word.toCharArray(); //каждое слово разбиваем на символы и записываем в массив
            for (int i = 0; i < chArray.length; i++){
                isUpper = false;
                if(Character.isUpperCase(chArray[i])){               //если символ в верхнем регистре, то меняем его
                    chArray[i] = Character.toLowerCase(chArray[i]);  //на нижний
                    isUpper = true;
                }
                if(isUpper && i != 0){                     //перед бывшим символом в верхнем регистре вставляем '_'
                    System.out.print("_" + chArray[i]);    //и выводим результат
                } else System.out.print(chArray[i]);
            }
            System.out.println(" ");
        }
    }
}
