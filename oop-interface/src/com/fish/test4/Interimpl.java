package com.fish.test4;

public class Interimpl implements InterA, InterB {
    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void function() {
        System.out.println("实现类中重写的默认方法");
    }
}
