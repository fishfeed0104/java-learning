package com.fish.enumtest;

public enum OrderState {
    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    OUT_FOR_DELIVERY("配送中"),
    DELIVERED("已到达"),
    CANCELLED("已取消");

    private String label;

    private OrderState(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
