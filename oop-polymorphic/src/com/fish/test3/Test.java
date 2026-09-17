package com.fish.test3;

public class Test {
    public static void main(String[] args) {
        /*
        1、定义狗类
        属性：年龄，颜色
        行为：eat(String something)(something表示吃的东西)
            看家lookHome方法(无参数)
        2、定义猫类
        属性：年龄，颜色
        行为：eat(String something)(something表示吃的东西)
            逮老鼠catchMouse方法(无参数)
        3、定义Person饲养员类
        属性：姓名，年龄
            行为：饲养动物keepPet(DOg dog,String something)方法

        要求：
        1、Person的饲养动物的方法需两个参数
        第一个参数：表示饲养的动物，既能饲养猫又能饲养狗，第二个参数：表示动物吃的东西
        2、在Person的keepPet方法中调用子类的特有功能
         */

        //定义饲养员对象
        Person person = new Person("张三", 30);
        System.out.println(person.getName() + " " + person.getAge());

        //定义狗对象
        Dog dog = new Dog(3, "黄色");
        System.out.println(dog.getAge() + " " + dog.getColor());

        //调用饲养员的饲养动物方法
        person.keepPet(dog, "骨头");

        //定义猫对象
        Cat cat = new Cat(2, "白色");
        System.out.println(cat.getAge() + " " + cat.getColor());

        //调用饲养员的饲养动物方法
        person.keepPet(cat, "老鼠");


    }
}
