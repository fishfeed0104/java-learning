package com.fish.loopfor;

import java.util.Scanner;

/*
 计算交错数列前n项之和
 数列规律：S(n) = 1 - 2 + 3 - 4 + ... + (-1)^(n+1) * n

 示例：
    输入：4
    说明：S(4) = 1 - 2 + 3 - 4 = -2
    输出：-2
 */
public class ForDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n: ");
        int n = sc.nextInt();

        // 输入合法性校验：n必须是非负整数
        if (n < 0) {
            System.out.println("n必须是非负整数");
            return;
        }

        int sum = 0;

        /*
            核心逻辑：
            遍历每一项i，根据奇偶性决定加还是减：
            - 奇数项(i=1,3,5,...):  加上 i
            - 偶数项(i=2,4,6,...):  减去 i

            由于i本身就等于当前项的数值，不再需要额外的变量a
         */
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }

        System.out.println("S(" + n + ") = " + sum);
    }
}