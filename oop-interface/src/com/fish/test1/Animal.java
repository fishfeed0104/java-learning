package com.fish.test1;

public abstract class Animal {
    //属性
    private String name;
    private String color;

    //构造
    public Animal() {}

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //行为
    public abstract void eat();

    //getter/setter
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
