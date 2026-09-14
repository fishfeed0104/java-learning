package com.fish.ooptest7;

public class Circle {
    //属性
    private double radius;
    private static final double PI = 3.14;

    //构造方法
    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    //行为
    public double getArea(){
        return radius * radius * PI;
    }

    public double getPerimeter(){
        return 2 * radius * PI;
    }

    //get/set
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getPI(){
        return PI;
    }
}
