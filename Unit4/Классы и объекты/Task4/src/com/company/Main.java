package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        boolean play = true;

        ArrayList<Train> trains = new ArrayList<>();
            trains.add(new Train("Брест", 645, "19:21"));
            trains.add(new Train("Пинск", 686, "07:38"));
            trains.add(new Train("Минск", 987, "15:43"));
            trains.add(new Train("Пинск", 686, "05:37"));
            trains.add(new Train("Гомель", 790, "4:20"));

        while (play) {
            menu();
            int n = in.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Для получения информации о поезде введите его номер: ");
                    int num = in.nextInt();
                    for (int i = 0; i < trains.toArray().length; i++) {
                        if (num == trains.get(i).getNumber()) {
                            System.out.println("Поезд №" + trains.get(i).getNumber());
                            System.out.println("Следует до станции: " + trains.get(i).getDestination());
                            System.out.println("Время отправления: " + trains.get(i).getDepartureTime());
                            System.out.println("");
                        }
                    }
                break;

                case 2:
                    trains.sort(new Comparator<Train>() {
                        @Override
                        public int compare(Train o1, Train o2) {
                            if (o1.getNumber() == o2.getNumber()) return 0;
                                else if (o1.getNumber() > o2.getNumber()) return 1;
                                    else return -1;
                            }
                    });

                    for (int i = 0; i < trains.toArray().length; i++) {
                        System.out.println(trains.get(i).getDestination() +
                            " " + trains.get(i).getNumber() +
                            " " + trains.get(i).getDepartureTime());
                    }
                break;

            case 3:
                trains.sort(new Comparator<Train>() {
                    @Override
                    public int compare(Train t1, Train t2) {
                        int result = t1.getDestination().compareTo(t2.getDestination());
                        if (result == 0) {
                            return t1.getDepartureTime().compareTo(t2.getDepartureTime());
                        }
                        return t1.getDestination().compareTo(t2.getDestination());
                    }
                });

                for (int i = 0; i < trains.toArray().length; i++) {
                    System.out.println("Пункт назначения: " + trains.get(i).getDestination() + "\n" +
                            "Номер поезда: " + trains.get(i).getNumber() + "\n" +
                            "Время прибытия: " + trains.get(i).getDepartureTime());
                    System.out.println(" ");
                }
                break;
            case 4:
                play = false;
                break;
            }
        }

    }

    public static void menu(){
        System.out.println(" ");
        System.out.println("Выберите пункт меню: ");
        System.out.println("1. Показать информацию о поезде");
        System.out.println("2. Отсортировать поезда по номеру");
        System.out.println("3. Отсортировать поезда по пункту назначения");
        System.out.println("4. Выход");
    }
}
