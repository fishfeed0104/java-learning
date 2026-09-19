package com.fish.test2;

public class Person {
    private String name;
    private int age;

    //构造
    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter/setter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
