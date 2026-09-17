package com.fish.test4;

public abstract class Pet {
    //属性
    private String name;
    private String color;

    //构造方法
    public Pet() {}
    public Pet(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //方法
    public abstract void eat();
    public void drink(){
        System.out.println(this.name + "在喝水");
    }

    //getter和setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
