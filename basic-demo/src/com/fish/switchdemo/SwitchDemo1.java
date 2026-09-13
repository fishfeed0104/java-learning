package com.fish.switchdemo;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        /*
        需求：键盘录入一个星期数，显示今天的减肥活动
        周一：跑步
        周二：游泳
        周三：跳绳
        周四：爬山
        周五：骑行
        周六：慢走
        周日：休息
         */
        //键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个星期数：");
        int day = sc.nextInt();

        //利用switch语句判断是星期几并显示活动
        switch(day){
            case 1 : System.out.println("跑步");
                break;
            case 2 : System.out.println("游泳");
                break;
            case 3 : System.out.println("跳绳");
                break;
            case 4 : System.out.println("爬山");
                break;
            case 5 : System.out.println("骑行");
                break;
            case 6 : System.out.println("慢走");
                break;
            case 7 : System.out.println("休息");
                break;
            default : System.out.println("没有这个星期数");
                break;
        }
    }
}
