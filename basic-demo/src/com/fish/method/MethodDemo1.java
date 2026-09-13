package com.fish.method;

public class MethodDemo1 {
    public static void main(String[] args) {
        //调用方法
        int sum = getSum(1, 2);
        System.out.println(sum);

    }

    //定义一个方法，求两个数之和
    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}