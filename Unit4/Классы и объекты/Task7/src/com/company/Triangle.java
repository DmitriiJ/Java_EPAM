package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Triangle {

    private static Scanner in = new Scanner(System.in);

    ArrayList<Integer> lines = new ArrayList<>();

    public void createTriangle(ArrayList<Integer> lines){

        int max = 0, maxPosition = 0;
        lines.clear();
                                                                    //заносим длины сторон треугольника в список
        System.out.println("Задайте сторону a треугольника: ");
        lines.add(in.nextInt());
        System.out.println("Задайте сторону b треугольника: ");
        lines.add(in.nextInt());
        System.out.println("Задайте сторону c треугольника: ");
        lines.add(in.nextInt());
                                                                    //находим сторону с максимальной длиной
        for (int i = 0; i < lines.size(); i++){
            if(lines.get(i) > max){
                max = lines.get(i);
                maxPosition = i;
            }
        }                                                         //ставим сторону с максимальной длиной в конец списка
        lines.add(lines.size(), lines.get(maxPosition));
        lines.remove(maxPosition);
                                                            //треугольник может быть построен лишь в том случае,
        if(lines.get(2) < lines.get(0) + lines.get(1)){     //когда его наибольшая сторона меньше суммы двух других
            System.out.println("Треугольник со сторонами " + lines.get(0) + ", " + lines.get(1) + ", " + lines.get(2)
            + " построен!");
        } else {
            System.out.println("Треугольник с такими сторонами не может быть построен.");
            lines.clear();
        }
    }

    public void findSquareOfTriangle(ArrayList<Integer> lines){

        isEmpty(lines);

        double S, p;
                                    //вычисляем площадь треугольника по формуле Герона
        p = (lines.get(0) + lines.get(1) + lines.get(2)) / 2.0;
        S = Math.sqrt(p * (p - lines.get(0)) * (p - lines.get(1)) * (p - lines.get(2)));

        System.out.println("Площадь треугольника: " + S);
    }

    public void perimeter(ArrayList<Integer> lines){

        isEmpty(lines);
                                                                //вычисляем периметр треугольника
        int per = lines.get(0) + lines.get(1) + lines.get(2);
        System.out.println("Периметр треугольника: " + per);
    }

    public void medianIntersectionPoint(ArrayList<Integer> lines){

        isEmpty(lines);

        double mc0, mc1, mc2;
        double mipCordinate0, mipCordinate1, mipCordinate2;
                                                            //вычисляем длины медиан
        mc0 = Math.sqrt(2.0 * Math.pow(lines.get(0), 2) + 2.0 * Math.pow(lines.get(1), 2) - lines.get(2)) / 2.0;
        mc1 = Math.sqrt(2.0 * Math.pow(lines.get(1), 2) + 2.0 * Math.pow(lines.get(2), 2) - lines.get(1)) / 2.0;
        mc2 = Math.sqrt(2.0 * Math.pow(lines.get(1), 2) + 2.0 * Math.pow(lines.get(2), 2) - lines.get(0)) / 2.0;
                                                    //находим, насколько удалена точка пересечения медиан
        mipCordinate0 = (mc0 / 3.0) * 2.0;          //от каждой вершины
        mipCordinate1 = (mc1 / 3.0) * 2.0;
        mipCordinate2 = (mc2 / 3.0) * 2.0;

        System.out.println("Точка пересечения медиан находится на расстоянии " + mipCordinate0 + " от вершины по первой" +
                " медиане");
        System.out.println("Точка пересечения медиан находится на расстоянии " + mipCordinate1 + " от вершины по второй" +
                " медиане");
        System.out.println("Точка пересечения медиан находится на расстоянии " + mipCordinate2 + " от вершины по третьей" +
                " медиане");
    }

    public void isEmpty(ArrayList<Integer> lines){
                                //если список пуст, значит пользователь ещё не создал треугольник
        if(lines == null) {
            System.out.println("Сперва создайте треугольник!");
            return;
        }
    }
}
