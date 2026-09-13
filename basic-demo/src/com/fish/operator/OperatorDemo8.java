package com.fish.operator;

import java.util.Scanner;

public class OperatorDemo8 {
    public static void main(String[] args) {
        /*
        练习一：键盘录入你和你朋友的身高，比比谁更高
        练习二：键盘输入一个三位数，判断是否能被3整除
         */
        Scanner sc = new Scanner(System.in);

        //练习一
        System.out.println("请输入你的身高： ");
        double height1 = sc.nextDouble();
        System.out.println("请输入你朋友的身高： ");
        double height2 = sc.nextDouble();

        boolean isHigher = height1 > height2;

        if(isHigher){
            System.out.println("你更高");
        }else{
            System.out.println("你朋友更高");
        }

        System.out.println("-----------------");


        //练习二
        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();
        int num2 = num % 3;

        boolean isDivisible = num2 == 0;

        if(isDivisible){
            System.out.println(num + "能被3整除");
        }else{
            System.out.println(num + "不能被3整除");
        }

    }
}