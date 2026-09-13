package com.fish.ifdemo;

public class IfDemo1 {
    /*
            定义一个变量表示人的体温，对体温进行判断是否大于等于38度，如果超过打印语音警告
     */
    public static void main(String[] args) {
        //定义一个变量表示人的体温
        double temperature = 38.5;

        //判断体温是否大于等于38度
        if(temperature >= 38){
            System.out.println("体温异常");
        }

    }
}
