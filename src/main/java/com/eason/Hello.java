package com.eason;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//            new Person().hello();
//            Person p = new Person();  //Person()系統預設無傳參數建構子
            Person p = new Person("Eason",1.7, 85.5);
            p.hello();
            p.height = 1.7;
            p.weight = 85.5;
            p.name = "Eason";
            System.out.println(p.name);
            System.out.println(p.bmi());

            /*int age = 19;   //short long
            Integer age2 = 19;
            char c = '我';
            Character c2 = c;
            byte b = 120;
            float weight = 66.5f;
            double height = 1.7;
            boolean adult = true;
            boolean enroll = false;
            String name = "Eason";*/
    }
}
