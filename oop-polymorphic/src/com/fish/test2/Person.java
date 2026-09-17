package com.fish.test2;

public class Person {
    //属性
    private String name;
    private int age;
    private String sex;

    //构造方法
    public Person() {
    }
    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    //方法
    public void use(Vehicle vehicle) {
        vehicle.move();
        //响铃，鸣笛
        if (vehicle instanceof Bike) {
            Bike bike = (Bike)vehicle;
            bike.ringbell();
        } else if (vehicle instanceof Car) {
            Car car = (Car)vehicle;
            car.horn();
        }else{
            System.out.println("不支持的交通工具");
        }
    }
    //getter和setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
}
