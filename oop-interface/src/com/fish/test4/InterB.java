package com.fish.test4;

public interface InterB {
    //新增的默认方法function
    public default void function() {
        System.out.println("接口B中新增的默认方法");
    }
}
