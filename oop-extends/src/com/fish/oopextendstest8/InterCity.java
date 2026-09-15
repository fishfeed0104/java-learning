package com.fish.oopextendstest8;

public class InterCity extends Express {
    public InterCity() {}
    public InterCity(String expressNumber, int weight, String receiver) {
        super(expressNumber, weight, receiver);
    }

    //计算快递费
    @Override
    public int payment(){
        return super.payment() + 20 * getWeight();
    }
}
