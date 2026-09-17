package com.fish.test2;

public class Car extends Vehicle {
    //构造方法
    public Car() {
    }
    public Car(String brand, int speed) {
        super(brand, speed);
    }
    //方法
    @Override
    public void move() {
        System.out.println(getBrand() + "的汽车在以" + getSpeed() + "的速度移动");
    }
    //鸣笛
    public void horn() {
        System.out.println(getBrand() + "的汽车在鸣笛");
    }

}
