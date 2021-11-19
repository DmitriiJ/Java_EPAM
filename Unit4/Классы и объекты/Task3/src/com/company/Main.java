package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        String ch;                                  //создание массива из объектов
        Student[] students = new Student[]{
                new Student("Дима", "E-248"),
                new Student("Ваня", "E-248"),
                new Student("Максим", "E-248"),
                new Student("Глеб", "E-248"),
                new Student("Оля", "E-248"),
                new Student("Рома", "E-248"),
                new Student("Катя", "E-248"),
                new Student("Коля", "E-248"),
                new Student("Алексей", "E-248"),
                new Student("Карим", "E-248"),
        };
                                         //выводим объекты на экран
        for (Student st : students){
            st.printStudents();
        }

        System.out.println("\n\nВывести наиболее успеваемых студентов? Y/N?");
        ch = in.nextLine();

        switch (ch){
            case "Y":                                 //вывод студентов с самой высокой успеваемостью
                for (Student student : students){
                    student.bestStudents();
                }
                break;
            case "N":
                return;
        }
    }
}
