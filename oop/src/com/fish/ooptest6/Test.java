package com.fish.ooptest6;

public class Test {
    public static void main(String[] args) {
        /*学生有以下属性：姓名年龄老师
        一个班级中，所有学生都是同一个老师
        第一名学生：兰芝，19岁
        第二名学生：虚虚，20岁
        最初都是不灵老师上课，有一天虚虚要求换老师，换成了乖乖老师
        利用static模拟上述效果
         */
        Student s = new Student();
        s.name = "兰芝";
        s.age = 19;
        s.teacher = "不灵老师";

        Student s2 = new Student();
        s2.name = "虚虚";
        s2.age = 20;
        s2.teacher = "乖乖老师";

        System.out.println(s.name + s.age + s.teacher);
        System.out.println(s2.name + s2.age + s2.teacher);
    }
}
