package com.fish.test2;

public class Vehicle {
    //属性
    private String brand;
    private int speed;

    //构造方法
    public Vehicle() {
    }
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    //方法
    public void move() {
        System.out.println(brand + "的交通工具在以" + speed + "的速度移动");
    }

    //getter和setter方法
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
