package com.fish.ooptest4;

public class Test {
    public static void main(String[] args) {
        //创建学生对象
        Student s = new Student();
        //赋值
        s.setName("张三");
        s.setAge(18);
        s.setHeight(183);
        s.setWeight(60);

        //要求一：
        //大一新生，张三，18岁，183cm，60kg，刚进大学努力学习
        System.out.println(s.getName() + " " + s.getAge() + " " + s.getHeight() + " " + s.getWeight());
        s.study();

        //要求二
        //大二期间，张三体重增加了10kg
        double newWeight = s.getWeight() + 10;
        s.setWeight(newWeight);
        int newAge = s.getAge() + 1;
        s.setAge(newAge);
        System.out.println(s.getName() + " " + s.getAge() + " " + s.getHeight() + " " + s.getWeight());

        //要求三
        //大三期间，张三减肥成功，身高增加2cm，体重减少3kg
        int newHeight = s.getHeight() + 2;
        s.setHeight(newHeight);

        double newWeight2 = s.getWeight() - 3;
        s.setWeight(newWeight2);

        int newAge2 = s.getAge() + 1;
        s.setAge(newAge2);
        System.out.println(s.getName() + " " + s.getAge() + " " + s.getHeight() + " " + s.getWeight());

        //要求四
        //打印大学毕业之后，张三的所有信息
        int newAge3 = s.getAge() + 2;
        s.setAge(newAge3);
        System.out.println(s.getName() + " " + s.getAge() + " " + s.getHeight() + " " + s.getWeight());
    }
}
