package com.fish.ooptest5;

public class Student {
    private String name;
    private int age;
    public Student(){

    }


    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void study() {
        System.out.println(name + "正在学习");
    }

    public void sleep(){
        System.out.println(name + "正在睡觉");
    }

    public void eat(){
        System.out.println(name + "正在吃饭");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age > 0 && age < 100) {
            this.age = age;
        }else{
            System.out.println("当前的" + age + "不在合理范围内");
        }
    }
    public int getAge(){
        return age;
    }
}
