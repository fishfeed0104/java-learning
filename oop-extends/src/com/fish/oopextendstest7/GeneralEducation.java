package com.fish.oopextendstest7;

public class GeneralEducation extends Teacher {
    public GeneralEducation() {}
    public GeneralEducation(String name, int age, String subject) {
        super(name, age, subject);
    }
    //行为
    @Override
    public void teach() {
        System.out.println(getName() + "正在教学通识课程");
    }
}
