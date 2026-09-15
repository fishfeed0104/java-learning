package com.fish.oopextendstest7;

public class Test {
    public static void main(String[] args) {
        /*
        书写一个完整的继承体系，要求私有化成员变量，get/set方法，构造方法，其他的成员方法
        本科学生：
        属性：姓名、年龄、年级
        行为：吃饭，睡觉，学习（攻读学士学位）
        硕士研究生：
        属性：姓名、年龄、年级
        行为：吃饭，睡觉，学习（攻读硕士学位）
        专业课老师：
        属性：姓名、年龄、学科
        行为：吃饭，睡觉，教学（讲专业课知识）
        通识课老师：
        属性：姓名、年龄、学科
        行为：吃饭，睡觉，教学（讲通识课知识）

        过了一段时间，硕士研究生住宿条件升级，在豪华版学生公寓睡觉
        */

        //创建学生对象
        UnderGraduate student1 = new UnderGraduate("张三", 18, 1);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getGrade());
        student1.study();
        student1.sleep();
        student1.eat();

        Graduate student2 = new Graduate("李四", 18, 1);
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getGrade());
        student2.study();
        student2.sleep();
        student2.eat();

        //创建老师对象
        Major teacher1 = new Major("王五", 30, "计算机");
        System.out.println(teacher1.getName());
        System.out.println(teacher1.getAge());
        System.out.println(teacher1.getSubject());
        teacher1.teach();
        teacher1.sleep();
        teacher1.eat();

        GeneralEducation teacher2 = new GeneralEducation("赵六", 30, "形势政策");
        System.out.println(teacher2.getName());
        System.out.println(teacher2.getAge());
        System.out.println(teacher2.getSubject());
        teacher2.teach();
        teacher2.sleep();
        teacher2.eat();
    }
}
