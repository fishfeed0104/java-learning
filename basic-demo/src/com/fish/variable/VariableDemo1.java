package com.fish.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
       /*
       微信余额有为0
       支付宝余额为20
       银行卡余额为10
       问题一：计算现有余额
       问题二：微信收入10元后又发红包2元，现有余额为多少
       */

        //定义一个变量记录微信的余额0
        double a = 0;

        //定义一个变量记录支付宝的余额20
        double b = 20;

        //定义一个变量记录银行卡的余额10
        double c = 10;

        //计算现有余额
        System.out.println(a + b + c);

        //微信收入十元
        a = a + 10;

        //微信发红包发出去2元
        a = a - 2;

        //输出微信现有余额
        System.out.println(a);

    }
}
