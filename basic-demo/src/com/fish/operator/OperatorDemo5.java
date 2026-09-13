package com.fish.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        //练习二：检查下列代码，程序运行时是否会报错，如果会报错，说明报错的原因
        short s1 = 100;
        short s2 = 200;

        //byte result2 = s1 + s2;
        //System.out.println(result2);

        /*
        由于s1和s2均为short类型，在进行运算过程中会先转换成int类型进行计算
        所以计算结果为int类型，因此代码可以改为int result2 = s1 + s2;
        或者byte result2 = (byte) (s1 + s2);但是这种转换会丢失精度
        因此实际运用时尽量不要使用强制转换
        */

        int result1= s1 + s2;
        System.out.println(result1);

        byte result2 = (byte) (s1 + s2);
        System.out.println(result2);
    }
}
