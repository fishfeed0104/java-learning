package com.fish.test3;

public class BasketballStudent extends Student {
    public BasketballStudent() {}
    public BasketballStudent(String name, int age) {
        super(name, age);
    }
    // 学习方法
    @Override
    public void learn() {
        System.out.println(getName() + "学习打篮球");
    }
}
