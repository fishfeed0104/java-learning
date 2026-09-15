package com.fish.oopextendstest6;

public class Person {
    String name;
    int age;

    //构造方法
    public Person(){
        System.out.println("父类的空参构造方法被调用");
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类的有参构造方法被调用");
    }
}
