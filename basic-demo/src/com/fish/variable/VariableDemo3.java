package com.fish.variable;

import com.sun.source.util.SourcePositions;

public class VariableDemo3 {
    public static void main(String[] args) {
        /*
        定义八种数据类型的变量：

        整数类型：byte、short、int、long
        浮点数类型：float、double
        字符类型：char
        布尔类型：boolean

        变量的定义格式：
                数据类型 变量名 = 变量值;

        */

        //定义byte类型的变量
        byte a = 127;
        System.out.println(a);

        //定义short类型的变量
        short b = 32767;
        System.out.println(b);

        //定义int类型的变量
        int c = 2147483647;
        System.out.println(c);

        //定义long类型的变量
        //注意：long类型的变量需要在变量值后添加L或l，否则会报错
        long d = 9223372036854775807L;
        System.out.println(d);

        //定义float类型的变量
        //注意：float类型的变量需要在变量值后添加f或F，否则会报错
        float e = 1000.2f;
        System.out.println(e);

        //定义double类型的变量
        double f = 1000.2;
        System.out.println(f);

        //定义char类型的变量
        char g = '伟';
        System.out.println(g);

        //定义boolean类型的变量
        boolean h = true;
        System.out.println(h);

    }
}
