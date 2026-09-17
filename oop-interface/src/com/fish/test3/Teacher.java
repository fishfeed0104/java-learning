package com.fish.test3;

public abstract class Teacher extends Person {
    // 构造方法
    public Teacher() {}
    public Teacher(String name, int age) {
        super(name, age);
    }

    // 教学方法
    public abstract void teach();
}
