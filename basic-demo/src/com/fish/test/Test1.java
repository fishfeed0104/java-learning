package com.fish.test;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        给你两个整数M和N，M表示的是红包的总额，N表示的是红包的个数
        现在又来N个人来抽红包，每个人都是随机的，打印每个人领的红包金额

         */
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        double M = 0;
        int N = 0;
        int total = 0;
        while(true) {
            System.out.println("请输入红包的总额（元）和红包的个数");
            M = sc.nextDouble();
            N = sc.nextInt();

            total = (int)(M * 100);
            if(M > 0 && N > 0 && total >= N) {
                break;
            } else {
                System.out.println("输入错误，请重新输入");
            }
        }



        int[] arr = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            if (i != N - 1) {
                int remainPeople = N - i;
                int maxCanTake = total - sum - (remainPeople - 1);
                arr[i] = r.nextInt(maxCanTake) + 1;
                sum += arr[i];
            } else {
                arr[i] = total - sum;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println("第" + (i + 1) + "个人领的红包金额为：" + (arr[i] / 100.0) + "元");
        }
    }
}