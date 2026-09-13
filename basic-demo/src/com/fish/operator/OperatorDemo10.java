package com.fish.operator;

import java.util.Scanner;

public class OperatorDemo10 {
    public static void main(String[] args) {
        /*
        需求一：
                键盘录入一个四位整数，判断这个数字是否为回文数

        需求二：
                寻找7的有缘数，定义一个两位数，只要该数字包含7或者7的倍数，就称为7的有缘数
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个四位整数：");
        int num = sc.nextInt();

        //数字拆分
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int qian = num / 1000;

        boolean isPalindrome = ge == qian && shi == bai;
        if(isPalindrome){
            System.out.println("这是一个回文数");
        }else{
            System.out.println("这不是一个回文数");
        }


        System.out.println("请输入一个两位数：");
        int num2 = sc.nextInt();
        int ge2 = num2 % 10;
        int shi2 = num2 / 10;
        boolean is7 = num2 % 7 == 0 || ge2 == 7 || shi2 == 7;
        if(is7){
            System.out.println("这是一个7的有缘数");
        }else{
            System.out.println("这不是一个7的有缘数");
        }
    }
}
