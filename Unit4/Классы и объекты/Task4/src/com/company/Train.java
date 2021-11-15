package com.company;

public class Train {

    private String destination;
    private int number;
    private String departureTime;

    //конструктор класса Train
    public Train(String destination, int number, String departureTime){
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
    }

    //геттеры
    public String getDestination() { return destination; }
    public int getNumber() { return number; }
    public String getDepartureTime() { return departureTime; }
}
