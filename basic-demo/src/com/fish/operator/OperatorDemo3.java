package com.fish.operator;

import java.util.Scanner;

public class OperatorDemo3 {
    public static void main(String[] args) {
        /*
        描述：
        给定一个秒数seconds，将其转换为对应的小时数、分钟数、秒数，
        使得总时间不变，但分钟数和秒数都不超过59

        输入描述：
        在一行中输入一个整数seconds，表示要转换的秒数，满足（0 <= seconds <= 100000000）

        输出描述：
        一行，包含三个整数依次为输入整数对应的小时数、分钟数、秒数（可能为0），中间用一个空格隔开

        示例：
        输入：3661
        输出：1 1 1
        */

        Scanner sc = new Scanner(System.in);
        //从键盘输入一个整数seconds
        int seconds = sc.nextInt();

        //计算小时数
        int hours = seconds / 3600;

        //计算分钟数
        int minutes = (seconds % 3600) / 60;

        //计算秒数
        int second = seconds % 60;

        //打印结果
        System.out.println(hours + "小时" + minutes + "分钟" + second + "秒");


    }
}
