package com.fish.ooptest1;

public class Test {
    public static void main(String[] args) {
        //创建对象，记录第一只小狗的信息
        Dog d = new Dog();
        d.name = "小白";
        d.age = 1;
        d.color = "白色";
        d.weight = 10;

        System.out.println(d.name);
        System.out.println(d.age);
        System.out.println(d.color);
        System.out.println(d.weight);

        //创建第二只小狗的信息
        Dog d2 = new Dog();
        d2.name = "大黄";
        d2.age = 1;
        d2.color = "黄色";
        d2.weight = 10;
    }
}
