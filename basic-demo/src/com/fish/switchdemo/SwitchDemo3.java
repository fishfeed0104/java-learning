package com.fish.switchdemo;

public class SwitchDemo3 {
    public static void main(String[] args) {
        /*
        switch新特性
        1、箭头标签
        2、case后面可以写多个值
        3、switch可以有运行结果
        4、yield关键字
         */

        int number = 3;
        String name = switch (number) {
            case 1, 4 -> "1";
            case 2, 5, 8 -> "2";
            case 3 -> "春";
            default -> "default";
        };
        System.out.println(name);

        //利用switch模拟计算器

        int a = 10;
        int b = 20;
        String operator = "+";
        int result = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
        System.out.println(result);
    }
}
