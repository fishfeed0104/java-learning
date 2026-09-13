package com.fish.loopwhile;

public class WhileDemo4 {
    public static void main(String[] args) {
        /*
            利用do-while循环输出5行"hello world"

            注：do-while循环熟悉语法就行，无需额外练习

            特点：先循环后判断，循环体至少执行一次
         */

        int count = 0;
        do{
            System.out.println("hello world");
            count++;
        }while(count<5);
    }
}
