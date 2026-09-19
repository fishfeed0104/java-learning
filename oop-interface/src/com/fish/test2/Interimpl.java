package com.fish.test2;

public class Interimpl extends Person implements Inter1, Inter2 {
    public Interimpl() {}
    public Interimpl(String name, int age) {
        super(name, age);
    }
    //如果一个类实现了多个接口，那么这个类必须实现所有接口的方法
    @Override
    public void method1() {
        System.out.println("Inter1的方法1");
    }
    @Override
    public void method2() {
        System.out.println("Inter1的方法2");
    }
    @Override
    public void function1() {
        System.out.println("Inter2的方法1");
    }
    @Override
    public void function2() {
        System.out.println("Inter2的方法2");
    }
}
