package com.plateer.ec1.order.data;


public enum OrderType {
    GENERAL("generalDataStrategy"),
    ECOUPON("ecouponDataStrategy");

    private String orderType;

    OrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderType() {
        return orderType;
    }

}
