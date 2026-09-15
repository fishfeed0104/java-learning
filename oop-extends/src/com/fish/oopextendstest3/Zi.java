package com.fish.oopextendstest3;

public class Zi extends Fu {
    String name = "子";

    public void print(){
        //要求输出结果为子
        System.out.println(name);
        System.out.println(this.name);
        //要求输出结果为父
        System.out.println(super.name);
        //要求输出结果为南昌
        System.out.println(address);
        System.out.println(this.address);
        System.out.println(super.address);
        //要求输出结果为吃
        eat();
        this.eat();
        super.eat();
    }

}
