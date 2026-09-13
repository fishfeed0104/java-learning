package com.fish.ifdemo;

import java.util.Scanner;

public class IfDemo7 {
    public static void main(String[] args) {
        /*
        键盘录入任意三个大于0的数，判断这三个数值构成什么类型的三角形
        需要判断的类型如下：等边，等腰，直角，普通，无效
        条件：两边之和大于第三边
         */

        Scanner sc = new Scanner(System.in);

        //键盘录入三个大于0的数
        System.out.println("输入三个大于0的数：");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        //判断是什么三角形
        if(a+b >= c && a+c >= b && b+c >= a){
            if(a == b && b == c){
                System.out.println("等边三角形");
            }else if(a == b || a == c || b == c){
                System.out.println("等腰三角形");
            }
            else if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b){
                System.out.println("直角三角形");
            }else{
                System.out.println("普通三角形");
            }
        }else{
            System.out.println("不是三角形");
        }

    }
}
