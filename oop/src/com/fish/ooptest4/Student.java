package com.fish.ooptest4;

public class Student {
    private String name;
    private int age;
    private int height;
    private double weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("当前的" + age + "不在合理范围内");
        }
    }

    public void setHeight(int height) {
        if (height > 100 && height < 250) {
            this.height = height;
        } else {
            System.out.println("当前的" + height + "不在合理范围内");
        }
    }

    public void setWeight(double weight) {
        if (weight > 40 && weight < 200) {
            this.weight = weight;
        } else {
            System.out.println("当前的" + weight + "不在合理范围内");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void study(){
        System.out.println(name + "正在学习");
    }

}
