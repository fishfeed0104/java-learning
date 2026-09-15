package com.fish.oopextendstest7;

public class Major extends Teacher {
    public Major() {}
    public Major(String name, int age, String subject) {
        super(name, age, subject);
    }
    //行为
    @Override
    public void teach() {
        System.out.println(getName() + "正在教学专业课程");
    }
}
