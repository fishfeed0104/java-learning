package com.fish.loopfor;

public class ForDemo4 {
    public static void main(String[] args) {
        /*
        需求：在实际开发中，如果要获取一个范围中的每一个数据时，就会用到循环
        但是，如果不想获取所有数据，只想获取其中的一部分数据，就会用到循环的判断语句
        比如，求1-100的偶数和
         */

        //定义求和变量
        int sum = 0;


        //利用if语句判断是否为偶数
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("1-100的偶数和为：" + sum);
    }
}
