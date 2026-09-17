package com.fish.test4;

public class Cat extends Pet {
    //构造方法
    public Cat() {
    }
    public Cat(String name, String color) {
        super(name, color);
    }
    //方法
    @Override
    public void eat() {
        System.out.println(getName() + "在吃鱼");
    }
    //猫的特有行为
    public void catchMouse() {
        System.out.println(getName() + "在抓老鼠");
    }
}
