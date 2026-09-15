package com.fish.oopextendstest6;

public class Student extends Person {
    int grade;
    public Student(){
        super();
        System.out.println("子类Student的空参构造方法被调用");
    }

    public Student(String name, int age, int grade){
        super(name, age);
        this.grade = grade;
        System.out.println("子类Student的有参构造方法被调用");
    }

}
