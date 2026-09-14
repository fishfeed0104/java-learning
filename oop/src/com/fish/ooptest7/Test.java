package com.fish.ooptest7;

public class Test {
    public static void main(String[] args) {
        /*
        定义一个javabean类描述圆
        属性：半径、
        行为：计算面积、计算周长
         */

        //创建一个圆对象
        Circle circle = new Circle(5);

        //获取圆的属性
        System.out.println("圆的半径为：" + circle.getRadius());
        System.out.println("圆的周率为：" + circle.getPI());

        //获取圆的面积和周长
        System.out.println("圆的面积为：" + circle.getArea());
        System.out.println("圆的周长为：" + circle.getPerimeter());
    }
}
