package com.fish.arrayutil;

public class ArrayUtil {

    private ArrayUtil() {
    }        // ← 关键：构造器私有（见下方说明）

    /**
     * 返回数组最大值；数组为 null 或空 → 抛 IllegalArgumentException
     */
    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("数组不能为空或null");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 返回数组最小值；数组为 null 或空 → 抛 IllegalArgumentException
     */
    public static int min(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("数组不能为空或null");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 返回所有元素之和；数组为 null 或空 → 抛 IllegalArgumentException
     */
    public static int sum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("数组不能为空或null");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 返回平均值（返回 double，避免 int 除法丢小数）；
     * 数组为 null 或空 → 抛 IllegalArgumentException（交给 sum 统一校验，不重复写）
     */
    public static double avg(int[] arr) {
        return (double) sum(arr) / arr.length;
    }


    /**
     * 返回 target 第一次出现的下标；
     * 找不到、或数组为空 → 返回 -1；数组为 null → 抛 IllegalArgumentException
     */
    public static int indexOf(int[] arr, int target) {
        if (arr == null) {
            throw new IllegalArgumentException("数组不能为null");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 把数组打印成 [1, 2, 3] 的形式（末尾不要多一个逗号）；
     * 空数组打印 []；数组为 null → 抛 IllegalArgumentException
     */
    public static void print(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("数组不能为null");
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * 返回一个逆序后的新数组（不要修改原数组！）；
     * 空数组返回空数组；数组为 null → 抛 IllegalArgumentException
     */
    public static int[] reverse(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("数组不能为null");
        }
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[arr.length - 1 - i] = arr[i];
        }
        return newArr;
    }
}
