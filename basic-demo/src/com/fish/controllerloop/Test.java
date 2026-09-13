package com.fish.controllerloop;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        生成一个1-100之间的随机数，利用键盘录入模拟猜的动作，一直猜直到猜中
         */
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        // 生成一个1-100之间的随机数
        //int num = r.nextInt();默认生成int取值范围内的随机数
        //第二种，括号里面写一个数n，生成0-n之间的随机数，不包含n
        //第三种，括号里面写两个数m,n，生成m-n之间的随机数，不包含n
        int num = r.nextInt(101);
        int count = 0;

        while (true) {
            //键盘录入一个数模拟猜数字
            System.out.println("请输入你要猜的数是：");
            int guess = sc.nextInt();

            count++;

            //比较猜的数和随机数
            if(guess > num){
                System.out.println("你猜的太大了，请重新输入");
            }else if(guess < num){
                System.out.println("你猜的太小了，请重新输入");
            }else{
                System.out.println("恭喜你猜中了");
                break;
            }


            if(count == 3){
                System.out.println("你猜了3次还没猜中，触发小保底机制，数字在" + (num-5) + "到" + (num+5) + "之间");
            }
            if(count == 10){
                System.out.println("你猜10次还没猜中，触发大保底机制，数字为" + num);
            }
        }


    }
}
