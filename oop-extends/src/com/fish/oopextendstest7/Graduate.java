package com.fish.oopextendstest7;

public class Graduate extends Student {
    public Graduate() {}
    public Graduate(String name, int age, int grade) {
        super(name, age, grade);
    }

    //行为
    @Override
    public void study() {
        System.out.println(getName() + "正在攻读硕士");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + "正在豪华版学生公寓睡觉");
    }
}
