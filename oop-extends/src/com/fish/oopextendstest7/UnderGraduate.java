package com.fish.oopextendstest7;

public class UnderGraduate extends Student {
    public UnderGraduate() {}
    public UnderGraduate(String name, int age, int grade) {
        super(name, age, grade);
    }
    //行为
    @Override
    public void study() {
        System.out.println(getName() + "正在攻读学士学位");
    }
}
