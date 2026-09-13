package com.fish.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {

        /*
        算术运算符：+ - * / %
        整数计算、小数计算
        */

        //整数计算
        //细节：整数计算的结果是整数，小数部分会被截断
        int a = 10;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println("-----------------");

        //小数计算
        //细节：小数计算不一定准确

        double c = 12.5;
        double d = 2.5;

        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c % d);





    }
}
