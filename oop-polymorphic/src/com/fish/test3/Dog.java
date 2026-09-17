package com.fish.test3;

public class Dog extends Pet {
    public Dog() {}
    public Dog(int age, String color) {
        super(age, color);
    }
    //方法
    public void lookHome() {
        System.out.println("狗在看家");
    }

    @Override
    public void eat(String something) {
        System.out.println("狗在吃"+something);
    }
}
