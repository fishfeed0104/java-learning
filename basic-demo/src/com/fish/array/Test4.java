package com.fish.array;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /*
        需求：已知数组元素为{8,2,3,4,5,6,7,1,9,10}
        要求：打乱数组中的数据

         */
        //定义一个数组
        int[] arr = {8,2,3,4,5,6,7,1,9,10};

        //遍历数组，交换元素
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int random = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[random];
            arr[random] = temp;
        }
        //遍历数组,输出数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
