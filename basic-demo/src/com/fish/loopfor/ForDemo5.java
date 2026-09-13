package com.fish.loopfor;

import java.util.Scanner;

public class ForDemo5 {
    public static void main(String[] args) {
        /*

        需求：键盘录入两个数字，表示一个范围，统计这个范围中
        即能被3整除，又能被5整除的数字有多少个
         */

        Scanner sc = new Scanner(System.in);
        //定义统计变量
        int count = 0;

        //键盘录入两个数字，表示一个范围
        System.out.println("请输入第一个数字：");
        int start = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int end = sc.nextInt();

        //如果起始值大于结束值，交换两个数
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        //利用for语句遍历范围中的每一个数字
        //既能被3整除又能被5整除，等价于能被15整除
        for (int i = start; i <= end; i++) {
            if (i % 15 == 0) {
                count++;
            }
        }
        System.out.println("这个范围中能被3整除，又能被5整除的数字有" + count + "个");

        //关闭资源
        sc.close();
    }
}