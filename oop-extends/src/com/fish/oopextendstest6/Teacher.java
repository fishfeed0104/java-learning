package com.fish.oopextendstest6;

public class Teacher extends Person {
    String subject;
    public Teacher(){
        super();
        System.out.println("子类Teacher的空参构造方法被调用");
    }

    public Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
        System.out.println("子类Teacher的有参构造方法被调用");
    }
}
