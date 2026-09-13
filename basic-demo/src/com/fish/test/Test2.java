package com.fish.test;

public class Test2 {
    public static void main(String[] args) {
        /*
        给定两个正序数组arr1和arr2，请先合并数组，并找出合并后的数组的中位数
         */
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[] arr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            arr[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            arr[k++] = arr2[j++];
        }

        System.out.println("合并后的数组：");
        for (int m = 0; m < arr.length; m++) {
            System.out.print(arr[m] + " ");
        }
        System.out.println();

        double median;
        if (arr.length % 2 == 1) {
            median = arr[arr.length / 2];
        } else {
            median = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        }
        System.out.println("中位数为：" + median);
    }
}