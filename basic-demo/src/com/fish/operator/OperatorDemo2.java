package com.fish.operator;

import java.util.Scanner;

public class OperatorDemo2 {
    public static void main(String[] args) {
        /*
        需求：键盘录入一个三位数，将其拆分成个位、十位、百位后，打印在控制台
        */

        //键盘录入一个三位数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number = sc.nextInt();

        //拆分个位
        int ge = number % 10;
        System.out.println("个位为：" + ge);

        //拆分十位
        int shi = (number / 10) % 10;
        System.out.println("十位为：" + shi);

        //拆分百位
        int bai = (number / 100) % 10;
        System.out.println("百位为：" + bai);
    }
}
