package com.fish.ooptest2;

public class Test {
    public static void main(String[] args) {
        //创建对象，记录第一部手机的信息
      Phone p = new Phone();
      p.brand = "小米";
      p.color = "白色";
      p.price = 2999;

      System.out.println(p.brand);
      System.out.println(p.color);
      System.out.println(p.price);

      //创建第二部手机的信息
      Phone p2 = new Phone();
      p2.brand = "iQoo";
      p2.color = "黄色";
      p2.price = 3999;

      System.out.println(p2.brand);
      System.out.println(p2.color);
      System.out.println(p2.price);

    }
}
