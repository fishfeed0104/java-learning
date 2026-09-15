package com.fish.oopextendstest7;

public class Student extends Person {
    private int grade;
    public Student() {}
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    //get/set方法
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    //行为
    public void study() {
        System.out.println(getName() + "正在学习");
    }
}
