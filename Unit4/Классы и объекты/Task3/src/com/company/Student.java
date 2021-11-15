package com.company;

import java.util.Arrays;

public class Student {

    String name;
    String group;
    int[] notes = new int[5];

    public Student(String name, String group){
        this.name = name;
        this.group = group;
        this.notes = notes;
        gettingNotes();

        for (Student student : students){
            student.bestStudents();
        }
    }

    public int[] gettingNotes(){
        notes = new int[5];
        for(int i = 0; i < notes.length; i++){
            notes[i] = (int) (Math.random() * 11) - 3;
        }
        return notes;
    }

    public void bestStudents(){
        boolean highNote = true;
        for(int i : notes){
            if(i < 9){
                highNote = false;
                break;
            }
        }
        if(highNote){
            System.out.printf(name + "\n" + group + "\n" + "Оценки:");
            for (int i : notes){
                System.out.print(i);
            }
        }
    }

    public String getName(){ return name; }
    public String getGroup(){ return group; }
    public int[] getNotes() {
        return Arrays.copyOf(notes, notes.length);
    }

    public void setName(String name) { this.name = name; }
    public void setGroup(String group) { this.group = group; }
}
