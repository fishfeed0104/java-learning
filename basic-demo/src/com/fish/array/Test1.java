package com.fish.array;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        需求：已知数组元素为{33,5,22,44,55,33}
        键盘录入任意一个数据，查询这个数据在数组中是否存在
        如果数组中要查找的数据出现多次，只要显示第一次的索引即可
        输出要求：
                如果存在打印索引
                如果不存在，提示“该数据不存在”
         */

        //定义一个数组
        int[] arr = {33,5,22,44,55,33};

        //键盘录入任意一个数据
        System.out.println("请输入要查找的数据：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //遍历数组，判断是否存在
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                System.out.println(i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("该数据不存在");
        }
    }
}
