package com.fish.ifdemo;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        /*
                需求：初始最大生命200，受到X伤害，技能恢复Y点血，X和Y由键盘录入而来
                假设，游戏人物不会死亡，最少一滴血
                问，最终游戏人物血量是多少
         */

        Scanner sc = new Scanner(System.in);

        //定义初始生命，以及从键盘录入受到伤害
        double hp = 200;
        System.out.println("输入受到的伤害X：");
        double X = sc.nextDouble();

        //计算受伤后血量=初始生命-X，判断血量是否大于1

        hp = hp - X;
        if(hp <=0){
           hp = 1;
        }

        //键盘录入恢复的血量
        System.out.println("输入恢复的伤害Y：");
        double Y = sc.nextDouble();

        //计算最终游戏人物血量
        hp = hp + Y;
        if(hp > 200){
            hp = 200;
        }
        System.out.println("最终游戏人物血量是" + hp);
    }
}
