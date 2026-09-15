package com.fish.oopextendstest4;

public class ThirdPhone extends SecondPhone{
    //重写call方法
    @Override
    public void call() {
        System.out.println("打电话升级为视频通话");
    }
    public void play() {
        System.out.println("玩游戏");
    }
}

