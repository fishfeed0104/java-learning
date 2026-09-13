package com.fish.method;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        跳水比赛有五个评委打分，分数在0到100之间，最终得分会去掉一个最高分，去掉一个最低分
        要求剩下的分数的平均值，改平均数为选手最终分
        要求1：利用键盘录入5个整除存入数组当中，如果分数超出范围要重新录入
        要求2：定义方法分别求数组的最大值最小值
        要求3：计算五名评委的总分
        要求4：去掉最高分和最低分，求选手最终平均分
         */

        Scanner sc = new Scanner(System.in);
        //定义一个数组，用于存储评委的打分
        double[] score = new double[5];
        //遍历数组，判断是否超出范围
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分");
            double test = sc.nextDouble();
            if (test < 0 || test > 100) {
                System.out.println("输入错误，请重新输入");
                i--;
                continue;
            }
            score[i] = test;

        }
        //求数组最大值最小值
        double max = max(score);
        System.out.println("分数最大值：" + max);
        double min = min(score);
        System.out.println("分数最小值：" + min);

        //计算五名评委的总分
        double sum = 0;
        for(int i=0;i<score.length;i++){
            sum += score[i];
        }
        //去掉最高分和最低分，求选手最终平均分
        double avg = (sum - max - min) / (score.length - 2);
        System.out.println("选手最终分：" + avg);
    }
    public static double max(double[] arr){
        double max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static double min(double[] arr){
        double min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
