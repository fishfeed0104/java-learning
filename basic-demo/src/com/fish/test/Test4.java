package com.fish.test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /*
        用数组的方式完成Test3
        arr[0] 存弃权票数，arr[1]~arr[5] 存1~5号候选人票数
         */
        int[] arr = new int[6];
        Random r = new Random();

        for (int i = 0; i < 1000; i++) {
            int num = r.nextInt(6);
            arr[num]++;
        }

        System.out.println("========== 投票结果 ==========");
        for (int i = 1; i < arr.length; i++) {
            System.out.printf("%d号候选人得票数为：%4d ，得票率为 %.1f%%%n",
                    i, arr[i], arr[i] * 100.0 / 1000);
        }
        System.out.println("==============================");
        System.out.printf("弃权票数为：%4d ，弃票率为 %.1f%%%n", arr[0], arr[0] * 100.0 / 1000);

        int max = arr[1];
        int maxIndex = 1;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.printf("得票最多的候选人为：%d号，得票数为：%d%n", maxIndex, max);
    }
}