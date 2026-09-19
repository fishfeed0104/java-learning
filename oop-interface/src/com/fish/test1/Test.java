package com.fish.test1;

public class Test {
    public static void main(String[] args) {
        /*
        青蛙Frog   属性：名字，颜色   行为：吃虫子，蛙泳
        狗Dog      属性：名字，颜色   行为：吃骨头，狗刨
        兔子Rabbit 属性: 名字，颜色   行为：吃胡萝卜
         */

        //创建一个青蛙
        Frog frog = new Frog("青蛙", "绿色");
        frog.eat();
        frog.swim();

        //创建一个狗
        Dog dog = new Dog("狗", "黄色");
        dog.eat();
        dog.swim();

        //创建一个兔子
        Rabbit rabbit = new Rabbit("兔子", "黄色");
        rabbit.eat();
    }
}
