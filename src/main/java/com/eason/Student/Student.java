package com.eason.Student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public void print(){
        System.out.println(name + "\n" + english + "\t"+ math +
                "\t" + (english + math)/2 );
    }
}
