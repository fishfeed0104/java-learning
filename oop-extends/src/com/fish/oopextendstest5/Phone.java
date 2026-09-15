package com.fish.oopextendstest5;

public class Phone extends SmartDevice {
    @Override
    public double payment(double price) {
        return 0.9*super.payment(price);
    }
}
