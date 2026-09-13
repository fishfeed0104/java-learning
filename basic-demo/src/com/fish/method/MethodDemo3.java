package com.fish.method;

public class MethodDemo3 {
    public static void main(String[] args) {
        /*
        给定两个长方形，判断哪个长方形的面积更大？
        如何定义方法呢
         */
        double area1 = area(5, 3);
        double area2 = area(4, 4);
        if (area1 > area2) {
            System.out.println("长方形1的面积更大");
        } else if (area1 < area2) {
            System.out.println("长方形2的面积更大");
        } else {
            System.out.println("两个长方形的面积相等");
        }
    }

    public static double area(double width, double length) {
        return width * length;
    }
}
