package com.fish.test1;

public class Student extends Person {
    //构造方法
    public Student() {
    }
    public Student(String name, String account, String password) {
        super(name, account, password);
    }
    //方法
    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
}
