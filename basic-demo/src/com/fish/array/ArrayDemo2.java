package com.fish.array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        /*
        数组的访问：获取数据和修改数据
        格式：数组名[索引]
        注意：索引从0开始，不能超过数组的长度
         */

        //利用静态初始化定义一个数组
        int[] age = {18, 19, 20};
        //获取数据
        int num = age[0];
        System.out.println(num);
        System.out.println(age[0]);
        System.out.println(age[1]);
        //修改数据
        age[0] = 21;
        System.out.println(age[0]);
    }
}
