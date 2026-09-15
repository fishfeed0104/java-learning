package com.fish.oopextendstest5;

public class Test {
    public static void main(String[] args) {
        //phone
        Phone p = new Phone();
        p.name = "Phone";
        p.price = 1000;
        System.out.println(p.payment(p.price));
        //laptop
        Laptop l = new Laptop();
        l.name = "Laptop";
        l.price = 5000;
        System.out.println(l.payment(l.price));
        //tablet
        Tablet t = new Tablet();
        t.name = "Tablet";
        t.price = 10000;
        System.out.println(t.payment(t.price));
    }
}
