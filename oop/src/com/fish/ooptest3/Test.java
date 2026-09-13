package com.fish.ooptest3;

public class Test {
    public static void main(String[] args) {
        Worker w = new Worker("兰芝", 18, 6);
        w.setAge(18);
        w.setName("兰芝");
        w.setWorkedHours(6);
        System.out.println(w.getWorkedHours());
        System.out.println(w.getAge());
        System.out.println(w.getName());




        w.work();
    }
}
