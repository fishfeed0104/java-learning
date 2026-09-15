package com.fish.oopextendstest8;

public class Express {
    private String expressNumber;
    private int weight;
    private String receiver;

    public Express() {}
    public Express(String expressNumber, int weight, String receiver) {
        this.expressNumber = expressNumber;
        this.weight = weight;
        this.receiver = receiver;
    }
    //get/set方法
    public String getExpressNumber() {
        return expressNumber;
    }
    public void setExpressNumber(String expressNumber) {
        this.expressNumber = expressNumber;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getReceiver() {
        return receiver;
    }
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    //计算快递费
    public int payment() {
        return weight * 10;
    }
}
