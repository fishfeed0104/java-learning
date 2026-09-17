package com.fish.test3;

public class Cat extends Pet {
    public Cat() {}
    public Cat(int age, String color) {
        super(age, color);
    }
    //方法
    public void catchMouse() {
        System.out.println("猫在逮老鼠");
    }

    @Override
    public void eat(String something) {
        System.out.println("猫在吃"+something);
    }
}
