package com.fish.test1;

public class Frog extends Animal implements Swim {
    public Frog() {}
    public Frog(String name,String color) {
        super(name, color);
    }

    @Override
    public void swim() {
        System.out.println(getName() + "在蛙泳");
    }

    @Override
    public void eat() {
        System.out.println(getName() + "在吃虫子");
    }
}
