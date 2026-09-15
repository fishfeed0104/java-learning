package com.fish.oopextendstest7;

public class Teacher extends Person {
    private String subject;
    public Teacher() {}
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    //get/set方法
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    //行为
    public void teach() {
        System.out.println(getName() + "正在教学");
    }
}
