package com.fish.oopextendstest1;

public class Test {
    public static void main(String[] args) {

        //创建对象
        Student s = new Student("张三", 18, 1);//
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.grade);
        s.study();
        s.eat();

        //创建教师对象
        Teacher t = new Teacher("李四", 30, "数学");
        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.subject);
        t.teach();
        t.eat();
    }
}
