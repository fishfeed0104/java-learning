package com.fish.test3;

public abstract class Person {
    private String name;
    private int age;

    // 构造方法
    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter/setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}