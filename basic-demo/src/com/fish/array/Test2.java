package com.fish.array;

public class Test2 {
    public static void main(String[] args) {
        /*
        需求：已知数组元素为{33,5,22,44,55}
        请找出数组中的最大值并打印出来
         */

        //定义一个数组
        int[] arr = {33,5,22,44,55};

        //遍历数组，判断最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
