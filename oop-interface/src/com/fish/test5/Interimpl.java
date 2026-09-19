package com.fish.test5;

public class Interimpl implements Inter {
    //虚方法表
    //非static，非final，非private
    //只有虚方法表里的方法才能被重写，方法重写的实际意义是替换了虚方法表中记录方法的内存地址
    /*此时相当于接口和实现类当中恰好有两个同名的方法而已，但是不构成重写关系
    public void method1() {
        System.out.println("method1");
    }*/

}
