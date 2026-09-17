package com.fish.test4;

public interface Inter {

    public abstract void method1();
    public abstract void method2();

    //新增的默认方法function
    public default void function() {
        System.out.println("接口中新增的默认方法");
    }
}
