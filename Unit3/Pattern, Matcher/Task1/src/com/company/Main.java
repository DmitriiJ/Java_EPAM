package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
                                                                                          //задаём текст для работы
        String str1 = "Vivamus ullamcorper vitae ex maximus, ac maximus augue lobortis purus." +
                "Curabitur eu eros non mi pulvinar porta. Curabitur lobortis erat sed quam aliquam, " +
                "ac imperdiet quam scelerisque. Aenean vestibulum ullamcorper diam non ornare." +
                "Quisque a ipsum nunc. Proin quam est, elementum vitae semper in, consequat eget enim." +
                "Sed ac vestibulum elit. Sed nisi orci, congue a lacinia nec, cursus id odio." +
                "Praesent sit amet neque et justo imperdiet varius. Vestibulum ut lacinia ante.\n" ;

        String str2 = "Fusce tempor varius est et auctor. Nunc condimentum sodales orci in iaculis." +
                "Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos." +
                "Proin porttitor mollis nunc, at lobortis nulla placerat at." +
                "Fusce quis sapien ac mauris vulputate consectetur volutpat dictum velit." +
                "Fusce a lacinia libero, id tempor mauris. Nullam eleifend est id eros vestibulum posuere." +
                "Nulla quis lacus sed justo convallis varius nec sed tellus." +
                "Etiam imperdiet, justo ac malesuada vehicula, mauris est eleifend urna," +
                "vitae fermentum ex est sit amet libero. Praesent euismod luctus tortor," +
                "sit amet pharetra nisi lacinia ac. Vestibulum vestibulum nibh vel erat sagittis euismod.\n";
                                                                                 //выводим текст и делаем,
        System.out.println("Текст: ");                                           //чтобы пользователь мог выбрать
        System.out.println(str1);                                                //пункт задания по введённой цифре
        System.out.println(str2);
        boolean isMenu = true;

        while (isMenu){
            tasksInput();
            System.out.println("Введите номер: ");
            int n = in.nextInt();
            int countSentence1 = 0, countSentence2 = 0;

            switch (n){
                case 1:
                    SentencesSort(str1, str2, countSentence1, countSentence2);
                    break;
                case 2:
                    WordsSort(str1, str2);
                    break;
                case 3:
                    WordsSortAlphabet(str1, str2);
                    break;
                case 4:
                    System.out.print("Всего доброго!");
                    isMenu = false;
                    return;
            }
        }
    }

                                                                     //метод отображения меню
    public static void tasksInput(){
        System.out.println("Выберите задание: ");
        System.out.println("1. Отсортировать абзацы по количеству предложений (по убыванию);");
        System.out.println("2. В каждом предложении отсортировать слова по длине(по нарастанию);");
        System.out.println("3. Отсортировать лексемы в предложении по убыванию количества вхождений заданного символа;");
        System.out.println("4. Выход.");
    }


                                                                        //метод для первого задания
    public static void SentencesSort(String str1, String str2, int countSentence1, int countSentence2){
                                                                        //ищем в тексте границы предложений
        Matcher matcher1 = Pattern.compile("(['.'|'?'|'!'])").matcher(str1);
        Matcher matcher2 = Pattern.compile("(['.'|'?'|'!'])").matcher(str2);

        while (matcher1.find()){                                        //и по ним считаем предложения каждого абзаца
            countSentence1++;
        }
        while (matcher2.find()){
            countSentence2++;
        }
                                                                                //выводим результат и первым тот абзац,
        if(countSentence1 > countSentence2 || countSentence1 == countSentence2){//в котором больше предложений
            System.out.println("В первом абзаце предложений больше!");
            System.out.println(str1);
            System.out.println(" ");
            System.out.println(str2);
        } else {
            System.out.println("Во втором абзаце предложений больше!");
            System.out.println(str2);
            System.out.println(" ");
            System.out.println(str1);
        }
    }

                                                                   //метод для второго задания
    public static void WordsSort(String str1, String str2){

        ArrayList<String> wordArray = new ArrayList<>();
        ArrayList<String> wordArrayResult = new ArrayList<>();

        boolean iter;
        String tmp;
        String str0 = str1 + str2;                                  //убираем все знаки препинания в тексте кроме точек,
                                                                    //которыми заканчиваются предложения. При сортировке
        String str1_1 = str0.replaceAll("[,]", "");//смысл всё равно потеряется. В нашем тексте есть
        String str1_2 = str1_1.replaceAll("[.]", " stOp ");//только запятые и точки. Точки заменяем
        System.out.println("Исходный текст: ");                     //на лексему "stOp", это позволит сортировать слова
        System.out.println(str1_2);                                 //отдельно в каждом предложении.
        String[] w = str1_2.split("['.']|\\s|\\n");           //разбиваем строку на слова и записываем в массив.

        for(int i = 0; i < w.length; i++){
            iter = true;
            wordArray.add(w[i]);                                   //методом пузырька сортируем каждое
            if(w[i].equals("stOp")){                                //предложение отдельно
                while (iter){
                    iter = false;
                    for(int j = 0; j < wordArray.size() - 1; j++){
                        if(wordArray.get(j).length() > wordArray.get(j + 1).length()){
                            tmp = wordArray.get(j);
                            wordArray.set(j, wordArray.get(j + 1));
                            wordArray.set(j + 1, tmp);
                            iter = true;
                        }
                    }
                }
                for (int m = 0; m < wordArray.size(); m++){        //передаём отсортированные слова итоговому массиву
                    wordArrayResult.add(wordArray.get(m));         //исходный массив стираем и заполняем словами
                }                                                  //из нового предложения
                wordArrayResult.add(".");
                for (int m = 0; m < wordArray.size();){
                    wordArray.remove(0);
                }
            }
        }

        for(int i = 0; i < wordArrayResult.size() - 1; i++){
            if(wordArrayResult.get(i).equals("") || wordArrayResult.get(i).equals("stOp")){
                wordArrayResult.remove(i);                         //удаляем лишнее из массива
            }
        }
        System.out.println("Отсортированный текст: ");
        for(String sortWords : wordArrayResult){                   //преобразуем каждый элемент массива в строку
            System.out.print(sortWords + " ");                     //и выводим на экран
        }
    }


    public static void WordsSortAlphabet(String str1, String str2){

        ArrayList<String> wordArray = new ArrayList<>();
        ArrayList<String> wordArrayResult = new ArrayList<>();
        ArrayList<String> wordArrayIsNotCoincidence = new ArrayList<>();

        System.out.println("Введите лексему: ");                            //запоминаем лексему, по которой
        char ch = in.next().charAt(0);                                      //будем сортировать
        int count, max = 0, tmp = 0, maxIndex = 0, iteration = 0;

        String str0 = str1 + str2;
        String str0_1 = str0.toLowerCase();                                 //меняем символы верхнего регистра на нижний
        System.out.println("Исходный текст: ");
        System.out.println(str0);
        String str1_1 = str0_1.replaceAll("[,]", "");      //убираем знаки препинания, а точку заменяем
        String str1_2 = str1_1.replaceAll("[.]", " stOp ");//на лексему "stOp", чтобы обозначить
        String[] w = str1_2.split("['.']|\\s|\\n");                   //границы предложений. Разбиваем текст на
                                                                            //слова и записываем в массив.
        for(int i = 0; i < w.length; i++){                                  //Слова каждого предложения сортируем по алфавиту и разбираем
            wordArray.add(w[i]);                                            //на символы, сравниваем с заданной лексемой.
            if(wordArray.get(i).equals("stOp")){                            //При совпадении увеличиваем счётчик.
                wordArray.set(wordArray.size() - 1, "");
                Collections.sort(wordArray);
                while (iteration <= wordArray.size() - 1){
                    while (tmp <= wordArray.size() - 1){
                        char[] chars = wordArray.get(tmp).toCharArray();
                        count = 0;
                        for(int j = 0; j < chars.length; j++){
                            if(chars[j] == ch){
                                count++;
                            }
                        }
                        if(count > max){                                    //находим слово с максимальным количеством
                            max = count;                                    //совпадений и запоминаем его индекс.
                            maxIndex = tmp;
                        } else if(count == 0 && iteration == wordArray.size() - 1){ //на последней итерации цикла, слова,
                            wordArrayIsNotCoincidence.add(wordArray.get(tmp));      //в которых нет совпадений записываем
                            wordArray.set(tmp, "");                                 //в отдельный массив.
                        }

                        tmp++;
                    }
                        wordArrayResult.add(wordArray.get(maxIndex));        //слово с наибольшим количеством совпадений
                        wordArray.set(maxIndex, "");                         //записываем первым в итоговый массив.
                        max = 0; maxIndex = 0; tmp = 0;                      //Сбрасываем счётчики.
                        iteration++;
                }
                for(int m = 0; m < wordArrayIsNotCoincidence.size(); m++){   //массив со словами, в которых нет совпадений,
                    wordArrayResult.add(wordArrayIsNotCoincidence.get(m));   //добавляем в итоговый массив с конца.
                    wordArrayIsNotCoincidence.set(m, "");
                }
                wordArrayResult.add(".");                                    //на границах предложений ставим точку
            }
            for(int m = 0; m < wordArrayResult.size() - 1; m++){             //удаляем лишнее с итогового массива
                if(wordArrayResult.get(m).equals("") || wordArrayResult.get(m).equals("stOp")){
                    wordArrayResult.remove(m);
                }
            }
        }                                                                     //выводим результат на экран
        System.out.println("Отсортированный текст: ");
        for(String sortWords : wordArrayResult){
            System.out.print(sortWords + " ");
        }
    }
}



