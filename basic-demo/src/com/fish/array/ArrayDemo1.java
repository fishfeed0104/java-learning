package com.fish.array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        /*
        数组的静态初始化：
        定义一个数组记录3位同学的年龄
        定义一个数组记录5位同学的身高
        定义一个数组记录3位同学的名字
         */

        int age[] = new int[]{18, 19, 20};
        int[] agearr = {18, 19, 20};
        double height[] = new double[]{1.8, 1.75, 1.9, 1.85, 1.9};
        double[] heightarr = {1.8, 1.75, 1.9, 1.85, 1.9};
        String name[] = new String[]{"张三", "李四", "王五", "赵六", "钱七"};
        String[] namearr = {"张三", "李四", "王五", "赵六", "钱七"};
    }
}
