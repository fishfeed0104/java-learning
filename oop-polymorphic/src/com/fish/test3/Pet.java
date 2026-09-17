package com.fish.test3;

public class Pet {
    //属性
    private int age;
    private String color;
    //构造方法
    public Pet() {
    }
    public Pet (int age, String color){
        this.age = age;
        this.color = color;
    }
    //方法
    public void eat(String something){
        System.out.println("动物在吃"+something);
    }

    //getter/setter方法
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
