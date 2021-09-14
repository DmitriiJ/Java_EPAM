package com.company;
import javax.lang.model.type.NullType;
import java.util.Scanner;

public class Test1 {

    private static Scanner in = new Scanner(System.in);
    public static int num1 = 25;
    public static int num2 = 2;

    public static void input(){
        System.out.println(num1 + " " + num2);
    }

    public static void changeNumbers(){
        System.out.println("Введите значение первого числа: ");
        num1 = in.nextInt();
        System.out.println("Введите значение второго числа: ");
        num2 = in.nextInt();
        System.out.println(num1 + " " + num2);
    }

    public static void summa(){
        System.out.println(num1 + num2);
    }

    public static void max(){
        if(num1 > num2){
            System.out.println(num1);
        } else if(num1 == num2){
            System.out.println("Числа равны!");
        }
        else {
            System.out.println(num2);
        }
    }
}
