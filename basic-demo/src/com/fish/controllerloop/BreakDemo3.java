package com.fish.controllerloop;

import java.util.Scanner;

public class BreakDemo3 {
    public static void main(String[] args) {
        /*牛牛在酒桌上玩一个小游戏，第一个人从1开始数数，如果遇到数字中含有数字4或数字是4的倍数，
        则跳过这个数字报下一个，谁数错了就要罚酒一杯。
        牛牛为了作弊，它想将所有符合规则的数字预先生成出来
        请你帮助牛牛列出1到n之间所有既不包含数字4又不是4的倍数的整数，按升序输出。
        */
        Scanner sc = new Scanner(System.in);
        //输入一个正整数n
        int n = 0;
        while(true){
            n = sc.nextInt();
            if(n >= 1 && n <= 100000){
                break;
            }
        }

        //利用循环列出所需整数
        for(int i = 1; i <= n; i++){
            if(i % 4 == 0){
                continue;
            }
            int temp = i;
            boolean hasFour = false;
            while(temp > 0){
                if(temp % 10 == 4){
                    hasFour = true;
                    break;
                }
                temp /= 10;
            }
            if(hasFour){
                continue;
            }
            System.out.println(i);
        }
    }
}