package com.fish.test3;

public abstract class Student extends Person {
    // 构造方法
    public Student() {}
    public Student(String name, int age) {
        super(name, age);
    }
    // 学习方法
    public abstract void learn();
}
