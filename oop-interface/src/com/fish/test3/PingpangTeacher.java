package com.fish.test3;

public class PingpangTeacher extends Teacher implements EnglishSpeaker {
    public PingpangTeacher() {}
    public PingpangTeacher(String name, int age) {
        super(name, age);
    }
    // 教学方法
    @Override
    public void teach() {
        System.out.println(getName() + "教打乒乓球");
    }
    // 说英语
    @Override
    public void say() {
        System.out.println(getName() + "说英语");
    }
}
