package com.company;

public class Test2 {

    private int num1;
    private int num2;

    private String name;
    private int age;

    public Test2(){                                         //конструктор по умолчанию
        num1 = 10;
    }

    public Test2(int a, int b, String name, int age){      //конструктор с параметрами
        this.num1 = a;
        this.num2 = b;
        this.name = name;
        this.age = age;
    }
                                                           //геттеры, сеттеры
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

}
