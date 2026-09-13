package com.fish.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {

        Random r = new Random();
        int num = 0, a = 0, b = 0, c = 0, d = 0, e = 0;
        //模拟投票
        for(int i = 0; i < 1000; i++) {
            num = r.nextInt(6);
            switch (num) {
                case 0:
                    break;
                case 1:
                    a++;
                    break;
                case 2:
                    b++;
                    break;
                case 3:
                    c++;
                    break;
                case 4:
                    d++;
                    break;
                case 5:
                    e++;
                    break;
                default:
                    break;

            }
        }
            //打印投票结果
            System.out.println("========== 投票结果 ==========");
            System.out.printf("一号候选人得票数为：%4d ，得票率为 %.1f%%%n", a, a * 100.0 / 1000);
            System.out.printf("二号候选人得票数为：%4d ，得票率为 %.1f%%%n", b, b * 100.0 / 1000);
            System.out.printf("三号候选人得票数为：%4d ，得票率为 %.1f%%%n", c, c * 100.0 / 1000);
            System.out.printf("四号候选人得票数为：%4d ，得票率为 %.1f%%%n", d, d * 100.0 / 1000);
            System.out.printf("五号候选人得票数为：%4d ，得票率为 %.1f%%%n", e, e * 100.0 / 1000);

            //找出得票最多的票选人
            int max = a;
            char maxChar = '1';
            if(b > max){
                max = b;
                maxChar = '2';
            }
            if(c > max){
                max = c;
                maxChar = '3';
            }
            if(d > max){
                max = d;
                maxChar = '4';
            }
            if(e > max){
                max = e;
                maxChar = '5';
            }
            //打印得票最多的票选人
            System.out.println("==============================");
            System.out.println("得票最多的候选人是：" + maxChar + "号");

            //求弃权票数及弃票率
            int vote =  1000 - (a + b + c + d + e);



    }
}