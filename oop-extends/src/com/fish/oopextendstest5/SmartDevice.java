package com.fish.oopextendstest5;

public class SmartDevice {
    String name;
    double price;

    public double payment(double amount) {
        if(amount > 0 && amount < 1000) {
            return amount;
        } else if (amount >= 1000 && amount < 5000) {
            return 0.9*amount;
        } else if (amount >= 5000 && amount < 10000) {
            return 0.8*amount;
        } else if (amount >= 10000) {
            return 0.7*amount;
        }else{
            return 0;
        }
    }
}
