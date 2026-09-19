package com.fish.test3;

public class PingpangStudent extends Student implements EnglishSpeaker {
    public PingpangStudent() {}
    public PingpangStudent(String name, int age) {
        super(name, age);
    }
    // 学习方法
    @Override
    public void learn() {
        System.out.println(getName() + "学习打乒乓球");
    }
    // 说英语
    @Override
    public void say() {
        System.out.println(getName() + "说英语");
    }
}
