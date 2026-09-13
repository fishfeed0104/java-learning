package com.fish.looploop;

public class Test5 {
    public static void main(String[] args) {
        /*
        打印99乘法表
         */
        //外循环决定行数
        for (int i = 1; i <= 9; i++) {
            //内循环决定列数
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();

            //\t 表示制表符，用于对齐输出结果，简单理解为一个大空格
            //真正的含义：在前面的字符后面补1-4个空格，让整体的长度凑成4的整数倍   ----idea
            //真正的含义：在前面的字符后面补1-8个空格，让整体的长度凑成8的整数倍
        }
    }
}
