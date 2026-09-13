package com.fish.method;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*
        某公司的运费如下（首重1kg，超出部分按kg计算，不足1kg按1kg计算）
        首重1kg：10元
        超出1-5kg：每kg加2元
        超出5kg：每kg加1.5元
        键盘录入小数，表示用户快递的重量，计算最终结果
        要求1：快递重量必须大于0，否则重新输入
        要求2：不同价位的计算，单独定义一个方法
         */

        Scanner sc = new Scanner(System.in);

        //键盘录入快递重量
        //判断快递重量是否大于0
        double kg = 0;
        while(true){
        System.out.println("请输入快递重量（kg）：");
        kg = sc.nextDouble();

        if(kg>0) {
            break;
        }else{
            System.out.println("快递重量必须大于0，请重新输入");
        }
        }
        //计算运费输出结果
        double price = price(kg);
        System.out.println("您的快递为" + kg + "kg，运费为" + price + "元");



    }
    //定义方法表示不同价位
    public static double price(double kg)  {
        double price = 0;
        if(kg > 5){
            price = 18 + Math.ceil(kg - 5) * 1.5;
        }else if(kg > 1) {
            price = 10 + Math.ceil(kg - 1) * 2;
        }else {
            price = 10;
        }
        return price;

    }
}