package com.fish.loopfor;

public class ForDemo3 {
    public static void main(String[] args) {
        /*
        需求：在实际开发中，如果要获取一个范围中的每一个数据时，就会用到循环
        需求：求1-5的和
         */

        //定义求和变量
        int sum = 0;

        for(int i=1;i<=5;i++){
            sum = sum + i;
        }
        System.out.println("1-5的和为：" + sum);
    }
}
