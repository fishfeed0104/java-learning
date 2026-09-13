package com.fish.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {

        //练习一：
        byte b = 100;
        short s = 200;
        double d = 20.3;



        //请说出下列代码在计算时的类型转换问题
        double result = b + s + d;
        System.out.println(result);

       /* 由于b是byte类型，s是short类型，b和s先转换成int类型，然后int和double仍为不同类型
        b和s继续转换为double类型，再最后进行三者运算，结果为double类型*/
    }
}
