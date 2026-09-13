package com.fish.ifdemo;

import java.util.Scanner;

public class IfDemo4 {
    public static void main(String[] args) {
        /*
        需求：定义一个小数表示考试成绩
        判断学生的考试成绩，如果大于等于60分输出通过，否则输出不通过
         */

        //定义考试成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("输入考试成绩：");
        double score = sc.nextDouble();

        //判断考试成绩是否在0-100之间
        if (score >= 0 && score <= 100) {
            //判断考试成绩是否大于等于60分
            if (score >= 60) {
                System.out.println("通过");
            } else {
                System.out.println("不通过");
            }
        }else  {
            System.out.println("成绩不合理");
            }

    }
}
