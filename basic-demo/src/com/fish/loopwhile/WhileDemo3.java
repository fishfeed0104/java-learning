package com.fish.loopwhile;

public class WhileDemo3 {
    public static void main(String[] args) {
        /*
        世界最高山峰珠穆朗玛峰的高度是8848.86米 = 8848860毫米
        假如我有一张足够大的纸，它的厚度是0.1毫米，
        请问，该张纸折叠多少次，可以折成珠穆朗玛峰的高度？
         */

        //定义变量
        double height = 0.1;
        int fold = 0;

        //循环实现
        while (height < 8848860) {
            height *= 2;
            fold++;
        }
        System.out.println("需要折叠" + fold + "次，才能折成珠穆朗玛峰的高度");

    }
}
