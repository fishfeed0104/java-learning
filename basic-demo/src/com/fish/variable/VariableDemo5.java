package com.fish.variable;

import java.util.Scanner;

public class VariableDemo5 {
    public static void main(String[] args) {

       /*

       键盘录入：
            第一步：找到Scanner这个打工人
            第二步：让Scanner干活

       */


        //找到Scanner这个打工人
        Scanner sc = new Scanner(System.in);

        //让Scanner干活
        //接收键盘录入的整数变量
        int a = sc.nextInt();
        System.out.println(a);

        //接收键盘录入的小数变量
        double b = sc.nextDouble();
        System.out.println(b);

        //接收键盘录入的字符变量
        String c = sc.next();
        System.out.println(c);

        

    }
}
