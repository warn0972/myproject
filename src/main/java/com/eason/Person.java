package com.eason;

public class Person {
    String name;
    double height;
    double weight;
/*    public Person(){

    }*/
    public Person(double height, double weight){
        this.height = height;
        this.weight = weight;
    }
    public Person(String name, double height, double weight){
        this(height, weight);
        this.name = name;


    }
    public double bmi(){
        double bmi = weight / (height*height);
        return bmi;
    }
    public void hello(){
        System.out.println("Hello Java");
    }
}
