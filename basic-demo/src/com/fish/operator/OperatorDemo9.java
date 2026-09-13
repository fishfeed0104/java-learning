package com.fish.operator;

import java.util.Scanner;

public class OperatorDemo9 {
    public static void main(String[] args) {
        /*
        练习一：键盘录入一个整数，判断这个数是否在1到10之间
        练习二：键盘录入一个整数，判断这个数是否不在1到10之间
         */

        Scanner sc = new Scanner(System.in);

        //练习一
        System.out.println("请输入一个整数：");
        int num1 = sc.nextInt();
        boolean isInRange = num1 >= 1 && num1 <= 10;
        if(isInRange){
            System.out.println(num1 + "在1到10之间");
        }else{
            System.out.println(num1 + "不在1到10之间");
        }

        //练习二
        System.out.println("请输入一个整数：");
        int num2 = sc.nextInt();
        boolean isOutRange = num2 < 1 | num2 > 10;
        if(isOutRange){
            System.out.println(num2 + "不在1到10之间");
        }else{
            System.out.println(num2 + "在1到10之间");
        }
    }
}
