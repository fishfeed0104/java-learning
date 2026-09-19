package com.fish.test3;

public class BasketballTeacher extends Teacher {
    public BasketballTeacher() {}
    public BasketballTeacher(String name, int age) {
        super(name, age);
    }
    @Override
    public void teach() {
        System.out.println(getName() + "教打篮球");
    }
}