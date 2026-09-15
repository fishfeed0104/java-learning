package com.fish.oopextendstest1;

public class Student extends Person {
    int grade;

    public Student() {}
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void study(){
        System.out.println(name + "正在学习");
    }
}
