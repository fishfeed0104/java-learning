package com.fish.arrayutil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        //定义初始数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //测试求最大值最小值
        System.out.println(ArrayUtil.max(arr));      // 10
        System.out.println(ArrayUtil.min(arr));      // 1

        //测试求数组和以及平均值
        System.out.println(ArrayUtil.sum(arr));      // 55
        System.out.println(ArrayUtil.avg(arr));      // 5.5

        //测试返回target第一次出现的下标（两条分支都要测）
        System.out.println(ArrayUtil.indexOf(arr, 5));     // 4  —— 能找到
        System.out.println(ArrayUtil.indexOf(arr, 99));    // -1 —— 找不到

        //测试打印数组
        ArrayUtil.print(arr);                        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //测试返回逆向数组
        ArrayUtil.print(ArrayUtil.reverse(arr));     // [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        ArrayUtil.print(arr);                        // 原数组应还是 1..10 ← 验证"没改原数组"
    }
}
