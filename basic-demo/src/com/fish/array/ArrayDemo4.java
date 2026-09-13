package com.fish.array;

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        /*
        数组的动态初始化

        格式：数组名 = new 数据类型[数组长度];
         */
        //利用动态初始化定义一个数组
        int[] age = new int[3];
        //用循环从键盘输入给数组赋值
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<age.length;i++){
            System.out.println("请输入第"+(i+1)+"个年龄");
            int num = sc.nextInt();
            age[i] = num;

        }
        //遍历数组
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
    }
}
