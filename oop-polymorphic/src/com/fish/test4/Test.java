package com.fish.test4;

public class Test {
    public static void main(String[] args) {
        /*
        猫类：
        属性：名字、颜色
        行为：猫吃鱼、猫抓老鼠、喝水
        狗类：
        属性：名字、颜色
        行为：狗吃骨头、狗看家、喝水
         */
        //创建猫对象和狗对象
        Cat cat = new Cat("小黄", "黄色");
        Dog dog = new Dog("小白", "白色");
        //调用方法
        cat.eat();
        cat.catchMouse();
        cat.drink();
        dog.eat();
        dog.lookHome();
        dog.drink();
    }
}
