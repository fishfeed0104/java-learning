package com.fish.oopextendstest8;

public class City extends Express {
    public City() {}
    public City(String expressNumber, int weight, String receiver) {
        super(expressNumber, weight, receiver);
    }
    //计算快递费
    @Override
    public int payment() {
        return super.payment() + 10 * getWeight();
    }
}
