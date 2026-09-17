package com.fish.test2;

public class Bike extends Vehicle {
    //构造方法
    public Bike() {
    }
    public Bike(String brand, int speed) {
        super(brand, speed);
    }
    //方法
    @Override
    public void move() {
        System.out.println(getBrand() + "的自行车在以" + getSpeed() + "的速度移动");
    }
    //响铃
    public void ringbell() {
        System.out.println(getBrand() + "的自行车在响铃");
    }

}
