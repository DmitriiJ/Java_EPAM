package com.company;

public class Main {

    public static void main(String[] args) {

        Test2 test2 = new Test2(12, 22, "Student", 21);        //объект класса
        String test2Name = test2.getName();
        int test2Age = test2.getAge();

        System.out.println("Name: " + test2Name);
        System.out.println("Age: " + test2Age);
    }
}
