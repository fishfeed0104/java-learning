package com.fish.oopextendstest6;

public class Test {
    public static void main(String[] args) {
        /*
        根据下面的描述定义继承结构
        学生：
        属性：姓名、年龄、年级
        老师
        属性：姓名、年龄、学科
         */

        //创建学生对象
        Student s = new Student("张三", 18, 1);
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.grade);
        Student s2 = new Student();


        //创建老师对象
        Teacher t = new Teacher("李四", 30, "数学");
        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.subject);
    }
}
