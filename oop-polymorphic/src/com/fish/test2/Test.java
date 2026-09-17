package com.fish.test2;

public class Test {
    public static void main(String[] args) {
        /*
            自行车：
            属性：品牌，行驶速度
            行为：移动move，响铃ringbell()
            汽车：
            属性：品牌，行驶速度
            行为：移动move，鸣笛horn()
            人：
            属性：名字，年龄，性别
            行为：行驶交通工具(能使用所有的交通工具)
         */
        //创建人
        Person person = new Person("张三", 18, "男");
        System.out.println(person.getName() + " " + person.getAge() + " " + person.getSex());
        //创建自行车
        Bike bike = new Bike("品牌自行车", 10);
        //使用自行车
        person.use(bike);
        //使用汽车
        Car car = new Car("品牌汽车", 100);
        //使用汽车
        person.use(car);
    }
}
