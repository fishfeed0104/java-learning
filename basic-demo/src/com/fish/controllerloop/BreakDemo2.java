package com.fish.controllerloop;

import java.util.Scanner;

public class BreakDemo2 {
    public static void main(String[] args) {
      /*
                需求：初始最大生命200，受到X伤害，技能恢复Y点血，X和Y由键盘录入而来
                假设，游戏人物不会死亡，最少一滴血
                问，最终游戏人物血量是多少

                要考虑的情况，键盘录入必须大于0，否则需要重新输入
         */

        Scanner sc = new Scanner(System.in);

        //定义初始生命，以及从键盘录入受到伤害
        double hp = 200;
        double X = 0;
        while (true) {
            System.out.println("输入受到的伤害X：");
            X = sc.nextDouble();
            if (X > 0) {
                break;
            } else {
                System.out.println("输入的伤害必须大于0，请重新输入：");
            }
        }

            //计算受伤后血量=初始生命-X，判断血量是否大于1

            hp = hp - X;
            if (hp <= 0) {
                hp = 1;
            }

            //键盘录入恢复的血量
            double Y = 0;
            while (true) {
                System.out.println("输入恢复的伤害Y：");
                Y = sc.nextDouble();
                if (Y > 0) {
                    break;
                } else {
                    System.out.println("输入的恢复伤害必须大于0，请重新输入：");
                }
            }

            //计算最终游戏人物血量
            hp = hp + Y;
            if (hp > 200) {
                hp = 200;
            }
            System.out.println("最终游戏人物血量是" + hp);
        }
    }
