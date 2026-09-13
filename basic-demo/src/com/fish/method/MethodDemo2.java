package com.fish.method;

import java.util.Random;

public class MethodDemo2 {
    public static void main(String[] args) {
        //需求：获取10个0-100之间的随机数并存入到数组当中，要保证数据是唯一的
        Random r = new Random();

        //定义一个动态数组
        int[] arr = new int[10];

        //遍历数组，将随机数存入到数组当中
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101);
            //判断数组中是否包含当前随机数（只检查已填充的部分）
            if(isExist(arr, arr[i], i)){
                i--;
                continue;
            }
        }

        //遍历数组,输出数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    //定义一个方法，判断数组中指定范围内是否包含指定的元素
    public static boolean isExist(int[] arr, int num, int end) {
        for(int i = 0; i < end; i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
}