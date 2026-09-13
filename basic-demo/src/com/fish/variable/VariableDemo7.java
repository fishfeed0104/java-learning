package com.fish.variable;

import java.util.Scanner;

public class VariableDemo7 {
    public static void main(String[] args) {


        //BMI = 体重 / 身高^2

        //找到Scanner
        Scanner sc = new Scanner(System.in);

        //从键盘中录入体重和身高
        System.out.println("请输入体重（单位：千克）：");
        double weight =sc.nextDouble();
        System.out.println("请输入身高（单位：米）：");
        double height =sc.nextDouble();

        //计算BMI值
        double bmi = weight / (height * height);
        System.out.println("您的BMI值为：" + bmi);

        //判断BMI值是否正常


    }
}
