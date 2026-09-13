package com.fish.loopfor;

public class ForDemo6 {
    public static void main(String[] args) {
        /*
            有一组特殊的数字，从第三项开始，每一项都是前两项的数字和，请问第10项的数字是多少
            0,1,1,2,3,5,8,13,21,34,55,89,...
         */
        final int N = 10;

        long prev = 0;
        long next = 1;

        for (int i = 1; i <= N; i++) {
            System.out.println("第" + i + "项的数字为：" + prev);
            long current = prev + next;
            prev = next;
            next = current;
        }
    }
}