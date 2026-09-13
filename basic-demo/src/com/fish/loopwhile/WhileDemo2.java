package com.fish.loopwhile;

public class WhileDemo2 {
    public static void main(String[] args) {
        /*
        假设你在银行投资了100000元，银行给出的复利是1.7%，问多少年能实现本金翻倍
        请问用什么循环呢，代码如何实现
         */
        //定义变量

        double principal = 100000;
        int year = 0;

        //循环实现
        while (principal < 200000) {
            year++;
            principal *= 1.017;
        }
        System.out.println("需要" + year + "年才能实现本金翻倍");

    }
}
