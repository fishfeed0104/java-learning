package com.fish.variable;

public class VariableDemo4 {
    public static void main(String[] args) {


        //BMI = 体重 / 身高^2

        //定义变量记录我的体重
        double weight = 52.9;

        //定义变量记录我的身高
        double height = 1.75;

        //计算我的BMI值
        double bmi = weight / (height * height);
        System.out.println(bmi);

        //计算当前身高在标准bmi下体重最大为多少
        double maxWeight = 23.9 * height * height;
        System.out.println(maxWeight);

    }
}
