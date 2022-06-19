package com.plateer.ec1.payment.data;

public enum PaymentType {
    INICIS("inicis"),
    POINT("point");

    private String paymentType;

    PaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentType() {
        return paymentType;
    }
}
