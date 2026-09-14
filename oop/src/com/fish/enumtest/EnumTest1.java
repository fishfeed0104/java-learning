package com.fish.enumtest;

public class EnumTest1 {
    public static void main(String[] args) {
        /*
        电商项目中，订单的状态只有以六种，请编写代码实现
        待支付 PAYMENT_PENDING
        处理中 PROCESSING
        已发货 SHIPPED
        配送中 OUT_FOR_DELIVERY
        已到达 DELIVERED
        已取消 CANCELLED
         */

        /*
        获取枚举类的对象
        细节：所有的枚举项，默认使用public static final修饰
         */

        //获取枚举类的对象
        OrderState orderState = OrderState.PAYMENT_PENDING;

        //获取枚举项的名称
        System.out.println(orderState.getLabel());

        //匹配
        switch (orderState) {
            case PAYMENT_PENDING:
                System.out.println("待支付");
                break;
            case PROCESSING:
                System.out.println("处理中");
                break;
            case SHIPPED:
                System.out.println("已发货");
                break;
            case OUT_FOR_DELIVERY:
                System.out.println("配送中");
                break;
            case DELIVERED:
                System.out.println("已到达");
                break;
            case CANCELLED:
                System.out.println("已取消");
                break;
            default:
                System.out.println("未知状态");
        }
    }
}
