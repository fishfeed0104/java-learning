package com.fish.oopextendstest4;

public class Test {
    public static void main(String[] args) {
        /*
        第一代手机：
        打电话
        第二代手机：
        打电话，发短信
        第三代手机：
        打电话升级为视频通话，发短信，玩游戏
         */
        //创建一个FirstPhone对象
        FirstPhone firstPhone = new FirstPhone();
        firstPhone.call();

        //创建一个SecondPhone对象
        SecondPhone secondPhone = new SecondPhone();
        secondPhone.call();
        secondPhone.send();

        //创建一个ThirdPhone对象
        ThirdPhone thirdPhone = new ThirdPhone();
        thirdPhone.call();
        thirdPhone.send();
        thirdPhone.play();
    }
}
