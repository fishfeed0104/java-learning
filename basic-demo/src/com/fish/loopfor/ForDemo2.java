package com.fish.loopfor;

public class ForDemo2 {
    public static void main(String[] args) {
        /*
        需求：在实际开发中，如果要获取一个范围中的每一个数据时，就会用到循环
        需求1：打印1-5
        需求2：打印5-1
         */

        //打印1-5
        for (int i = 1; i <= 5; ++i) {
            System.out.println(i);
        }

        //打印5-1
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
