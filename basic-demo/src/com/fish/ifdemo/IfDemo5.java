package com.fish.ifdemo;


import java.util.Scanner;

public class IfDemo5 {
    public static void main(String[] args) {
        /*
            需求：小明每次订外卖都会在多家平台进行对比，看谁的优惠力度更大
            已知：
                饱了么App：全场九折优惠卷
                美单App：满三十减十元
             请问1：
                小明买了一顿烧烤50元，在哪家下单更划算
             请问2；
                如果你价格不确定，数据有键盘录入而来呢
         */

        Scanner sc = new Scanner(System.in);

        //定义并从键盘输入外卖的原价格
        System.out.println("外卖原价格为");
        double price = sc.nextDouble();

        //分别计算两家外卖优惠后价格
        //细节：变量只在所属的大括号中有效
        /*
            如果不在外部定义double mei而是直接使用if语句，后续判断两家价格会报错
         */
        double bao = 0.9 * price;
        double mei = price;
        if(price >= 10){
            mei = price - 10;
        }

        System.out.println("饱了么App优惠后价格为：" + bao);
        System.out.println("美单App优惠后价格为：" + mei);

        //比较两家价格
        boolean isBaoCheaper = bao < mei;
        if(isBaoCheaper){
            System.out.println("小明在饱了么App下单更划算");
        }else{
            System.out.println("小明在美单App下单更划算");
        }
    }
}
