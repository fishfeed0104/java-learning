package com.fish.ooptest5;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("兰芝", 18);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.study();
        s.sleep();
        s.eat();
        System.out.println(s);

    }
}
