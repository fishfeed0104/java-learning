package com.fish.variable;

import java.util.Scanner;

public class VariableDemo6 {
    public static void main(String[] args) {
        /*
        定义两个整数类型的变量num1和num2，键盘录入数据分别为两个变量赋值
        求两个数的和并进行打印
        */

        //找到Scanner这个打工人
        Scanner sc = new Scanner(System.in);

        //让Scanner干活
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();

        //计算两个数的和
        int sum = num1 + num2;
        System.out.println("两个数的和为：" + sum);


    }
}
