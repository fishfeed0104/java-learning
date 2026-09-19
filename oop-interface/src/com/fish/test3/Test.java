package com.fish.test3;

public class Test {
    public static void main(String[] args) {
        /*
        我们现在有乒乓球运动员和篮球运动员，乒乓球教练和篮球教练
        为了出国交流，跟乒乓球相关的人员都需要学习英语
        请用所有知识分析，这个案例中，哪些是具体类，哪些是抽象类，哪些是接口


        乒乓球运动员：姓名，年龄，学打乒乓球，说英语
        篮球运动员：姓名，年龄，学打篮球
        乒乓球教练：姓名，年龄，教乒乓球，说英语
        篮球教练：姓名，年龄，教篮球
         */

        //创建乒乓球运动员对象
        PingpangStudent p1 = new PingpangStudent("张三", 18);
        System.out.println(p1.getName() + " " + p1.getAge());
        p1.learn();
        p1.say();

        //创建篮球运动员对象
        BasketballStudent b1 = new BasketballStudent("李四", 18);
        System.out.println(b1.getName() + " " + b1.getAge());
        b1.learn();

        //创建乒乓球教练对象
        PingpangTeacher p2 = new PingpangTeacher("王五", 30);
        System.out.println(p2.getName() + " " + p2.getAge());
        p2.teach();
        p2.say();

        //创建篮球教练对象
        BasketballTeacher b2 = new BasketballTeacher("赵六", 30);
        System.out.println(b2.getName() + " " + b2.getAge());
        b2.teach();


    }
}