package com.fish.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        /*
          我方：叉子        对方：长手
          攻击：250         攻击：220
          防御：100         防御：90
          血量：1200.5      血量：1000.3
          技能倍率：1.5      技能倍率：1.2

          技能造成伤害公式：(攻击-防御)*技能倍率
          普通攻击造成伤害公式：攻击-防御

          计算：
          我方第一次造成普通攻击，对敌方造成多少伤害，敌方剩余多少血量
          我方第二次造成技能攻击，对敌方造成多少伤害，敌方剩余多少血量

        */
       //定义我方各个属性变量
        int attack1 = 250;
        int defense1 = 100;
        double blood1 = 1200.5;
        double skill1 = 1.5;

        //定义对方各个属性变量
        int attack2 = 220;
        int defense2 = 90;
        double blood2 = 1000.3;
        double skill2 = 1.2;

        //计算我方第一次普通普通攻击造成伤害
        double damage1 = attack1 - defense2;

        //计算第一次攻击后敌方剩余血量
        blood2 = blood2 - damage1;

        //输出第一次攻击结果
        System.out.println("我方第一次普通攻击造成伤害为：" + damage1);
        System.out.println("敌方剩余血量为：" + blood2);

        //计算第二次攻击后造成的伤害及对方所剩血量
        double damage2 = (attack1 - defense2) * skill1;
        blood2 = blood2 - damage2;

        //输出第二次攻击结果
        System.out.println("我方第二次技能攻击造成伤害为：" + damage2);
        System.out.println("敌方剩余血量为：" + blood2);



    }
}
