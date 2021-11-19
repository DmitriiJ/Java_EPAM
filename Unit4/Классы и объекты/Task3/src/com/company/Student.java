package com.company;

public class Student {

    String name;
    String group;
    int[] notes = new int[5];

    public Student(String name, String group){
        this.name = name;
        this.group = group;
        gettingNotes();
    }
                                   //задаём рандомные оценки студентам(в диапозоне 8-10)
    public int[] gettingNotes(){
        notes = new int[5];
        for(int i = 0; i < notes.length; i++){
            notes[i] = (int) (Math.random() * 3) + 8;
        }
        return notes;
    }
                                   //производим выборку студентов, у которых оценки 9-10
    public void bestStudents(){
        boolean highNote = true;
        for(int i : notes){
            if(i < 9){
                highNote = false;
                break;
            }
        }
        if(highNote){
            System.out.printf("\n\n" + name + "\n" + group + "\n" + "Оценки: ");
            for (int i : notes){
                System.out.print(i + ", ");
            }
        }
    }
                                       //печатаем информацию о всех студентах
    public void printStudents() {

        System.out.printf("\n\n" + name + "\n" + group + "\n" + "Оценки: ");
        for (int n = 0; n < notes.length; n++) {
            System.out.print(notes[n] + ", ");
        }
    }
}
