package com.fish.oopextendstest1;

public class Teacher extends Person {
    String subject;

    public Teacher() {}

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void teach() {
        System.out.println(name + "正在教学");
    }
}
