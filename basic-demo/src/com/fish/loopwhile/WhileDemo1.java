package com.fish.loopwhile;

public class WhileDemo1 {
    public static void main(String[] args) {
        /*
            利用while循环，实现游戏中连续跳跃十次，用输出语句模拟跳跃的逻辑

            格式：
            初始化语句
            while(条件判断语句){
            循环体
            条件控制语句
            }
         */

        //定义初始化语句

        int n = 1;

        //利用while循环
        while (n <= 10) {
            System.out.println("跳跃" + n + "次");
            n++;
        }
    }
}
