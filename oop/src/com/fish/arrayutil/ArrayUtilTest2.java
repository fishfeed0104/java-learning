package com.fish.arrayutil;

public class ArrayUtilTest2 {
    public static void main(String[] args) {
        //定义null和空数组验证
        int[] arr = {};          // 空数组
        int[] arr2 = null;       // null

        //测试求最大值最小值
        //System.out.println(ArrayUtil.max(arr));      // 预期:抛 IllegalArgumentException(数组不能为空或null)
        //System.out.println(ArrayUtil.min(arr));      // 预期:抛 IllegalArgumentException(数组不能为空或null)

        //System.out.println(ArrayUtil.max(arr2));     // 预期:抛 IllegalArgumentException(数组不能为空或null)
        //System.out.println(ArrayUtil.min(arr2));     // 预期:抛 IllegalArgumentException(数组不能为空或null)

        //测试求数组和以及平均值
        //System.out.println(ArrayUtil.sum(arr));      // 预期:抛 IllegalArgumentException
        //System.out.println(ArrayUtil.avg(arr));      // 预期:抛 IllegalArgumentException(由 sum 抛出)

        //System.out.println(ArrayUtil.sum(arr2));     // 预期:抛 IllegalArgumentException
        //System.out.println(ArrayUtil.avg(arr2));     // 预期:抛 IllegalArgumentException(由 sum 抛出)

        //测试返回target第一次出现的下标
        //System.out.println(ArrayUtil.indexOf(arr, 5));    // 预期:打印 -1(空数组里找不到,不抛异常)
        //System.out.println(ArrayUtil.indexOf(arr2, 5));   // 预期:抛 IllegalArgumentException(null 是非法参数)

        //测试打印数组
        //ArrayUtil.print(arr);                        // 预期:打印 [](空数组照常打印)
        //ArrayUtil.print(arr2);                       // 预期:抛 IllegalArgumentException

        //测试返回逆向数组
        //ArrayUtil.print(ArrayUtil.reverse(arr));     // 预期:打印 [](反转空数组 = 空数组)
        //ArrayUtil.print(ArrayUtil.reverse(arr2));    // 预期:抛 IllegalArgumentException
    }
}
