package com.eason.Student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        System.out.println("Please enter student's name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Please enter student's english: ");
        int english = scanner.nextInt();
        System.out.println("Please enter student's math: ");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        /*stu.name = "Eason";
        stu.english = 60;
        stu.math = 80;*/
        stu.print();
    }
}
