package com.fish.switchdemo;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        /*
        根据用户输入的月份，输出季节
        春季：3月4月5月
        夏季：6月7月8月
        秋季：9月10月11月
        冬季：12月1月2月
         */
        //键盘录入月份
        Scanner sc = new Scanner(System.in);
        System.out.println("输入月份：");
        int month = sc.nextInt();

        //判断季节
        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
