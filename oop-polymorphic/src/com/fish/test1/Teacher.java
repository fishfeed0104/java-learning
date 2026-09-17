package com.fish.test1;

public class Teacher extends Person {
    //构造方法
    public Teacher() {
    }
    public Teacher(String name, String account, String password) {
        super(name, account, password);
    }
    //方法
    @Override
    public void work() {
        System.out.println("老师的工作是教学");
    }
}
