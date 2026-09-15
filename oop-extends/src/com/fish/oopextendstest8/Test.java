package com.fish.oopextendstest8;

public class Test {
    public static void main(String[] args) {
        /*
        快递公司需要计算运费，基础快递包含单号String，重量int，收件人String
        行为：计算快递费（计算规则每公斤10元，不需要考虑小数部分）
        额外还有两种有基础快递衍生出来的特殊情况

        同城速递：
        重新计算快递费，在原有的基础上加10元/公斤

        异地空运：
        重新计算快递费，在原有的基础上加20元/公斤
         */

        //创建普通快递对象
        Express express = new Express("1",15, "张三");
        System.out.println("快递费用为" + express.payment());

        //创建同城速递对象
        City express2 = new City("2",30,"李四");
        System.out.println("快递费用为" + express2.payment());

        //创建异地空运对象
        InterCity express3 = new InterCity("3",30,"王五");
        System.out.println("快递费用为" + express3.payment());
    }
}
