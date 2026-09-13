package com.fish.ifdemo;

import java.util.Scanner;

public class IfDemo6 {
    public static void main(String[] args) {
        /*
            需求：很多App有不同的优惠卷
            假设：现在有以下优惠卷
                  全场商品满10减8
                  全场商品满50减30
                  全场商品满100减50
                  全场商品满200减90

                  会员卡：全场8折
                  请问：会员卡和优惠卷不能同时使用，最优惠的价格是多少
         */
        //定义并从键盘输入商品的原价格
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品原价格：");
        double price = sc.nextDouble();

        if(price < 0){
            System.out.println("商品原价格有误");
            return;
        }

        //计算两种方式优惠后的价格
        double juan;
        if(price >= 10 && price < 50){
            juan = price - 8;
        }else if(price >= 50 && price < 100){
            juan = price - 30;
        }else if(price >= 100 && price < 200){
            juan = price - 50;
        }else {
            juan = price - 90;
        }


        double ka = 0.8 * price;

        //比较两种方式的价格并输出优惠的价格及方式
        boolean isJuanCheaper = juan < ka;
        if(isJuanCheaper){
            System.out.println("优惠卷更划算，价格为：" + juan);
        }else{
            System.out.println("会员卡更划算，价格为：" + ka);
        }
    }
}