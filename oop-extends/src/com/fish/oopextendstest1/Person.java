package com.fish.oopextendstest1;

public class Person {
    String name;
    int age;

    public Person(){}

    public Person(String name, int age){
        this.name = name;
        this.age = checkAge(age);
    }

    public void eat(){
        System.out.println(name + "正在吃东西");
    }

    public int checkAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("年龄不合法");
        }return age;
    }

}
