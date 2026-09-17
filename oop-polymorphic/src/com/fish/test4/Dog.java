package com.fish.test4;

public class Dog extends Pet {
    //构造方法
    public Dog() {
    }
    public Dog(String name, String color) {
        super(name, color);
    }
    //方法
    @Override
    public void eat() {
        System.out.println(getName() + "在吃骨头");
    }
    //狗的特有行为
    public void lookHome() {
        System.out.println(getName() + "在看家");
    }
}
