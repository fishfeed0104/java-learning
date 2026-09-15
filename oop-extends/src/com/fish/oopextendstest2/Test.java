package com.fish.oopextendstest2;

public class Test {
    public static void main(String[] args) {
        /*
        现在有三个电子设备，请设计他们的继承结构
        安卓手机：
        属性：品牌，价格
        行为：打电话，发短信，nfc功能
        苹果手机：
        属性：品牌，价格
        行为：打电话，发短信
        笔记本电脑：
        属性：品牌，价格
        行为：编程
         */
        //创建安卓手机对象
        Android a = new Android();
        a.brand = "IQOO";
        a.price = 2900;
        System.out.println(a.brand + "\t" + a.price);
        a.call();
        a.send();
        a.nfc();
        //创建苹果手机对象
        IOS i = new IOS();
        i.brand = "IPHONE";
        i.price = 6900;
        System.out.println(i.brand + "\t" + i.price);
        i.call();
        i.send();

        //创建笔记本电脑对象
        Laptop l = new Laptop();
        l.brand = "MACBOOK";
        l.price = 12900;
        System.out.println(l.brand + "\t" + l.price);
        l.program();
    }
}
