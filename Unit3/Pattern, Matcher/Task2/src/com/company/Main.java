package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        StringBuilder strBuilder = new StringBuilder();

        String str = "<notes> \n" +
                "   <note id = \"1\"> \n" +
                "       <to>Вася</to> \n" +
                "       <from>Света</from> \n" +
                "       <heading>Напоминание</heading> \n" +
                "       <body>Позвони мне завтра!</body> \n" +
                "   </note> \n" +
                "   <note id = \"2\"> \n" +
                "       <to>Петя</to> \n" +
                "       <from>Маша</from> \n" +
                "       <heading>Важное напоминание</heading> \n" +
                "       <body/> \n" +
                "   </note> \n" +
                "</notes>";
        System.out.println(str);
        System.out.println(" ");

        Pattern openTag = Pattern.compile("<\\w.+?>");
        Pattern closeTag = Pattern.compile("</\\w.+?>");
        Pattern body = Pattern.compile(">.+?<");
        Pattern noBodyTag = Pattern.compile("<\\w.+?>");

        String[] sentences = str.split("\n");

        for (String sentence : sentences){                            //обрабатываем отдельно каждую строку текста

            Matcher matcherOpenTag = openTag.matcher(sentence);
            Matcher matcherCloseTag = closeTag.matcher(sentence);
            Matcher matcherBody = body.matcher(sentence);
            Matcher matcherNoBodyTag = noBodyTag.matcher(sentence);

            if(matcherOpenTag.find()){
                strBuilder.append(matcherOpenTag.group());           //в зависимости от вида тега, добавляем к нему
                strBuilder.append(" - открывающий тег\n");           //определённое описание
            }

            if(matcherCloseTag.find()){
                strBuilder.append(matcherCloseTag.group());
                strBuilder.append(" - закрывающий тег\n");
            }

            if(matcherBody.find()){
                strBuilder.append("'");
                strBuilder.append(matcherBody.group(), 1, matcherBody.group().length() - 1);
                strBuilder.append("' - тело тега\n");
            }

            if(matcherNoBodyTag.find()){
                strBuilder.append(matcherNoBodyTag.group());
                strBuilder.append(" - тег без тела\n");
            }
        }                                                           //выводим на экран результат
        System.out.println(strBuilder);
    }
}
