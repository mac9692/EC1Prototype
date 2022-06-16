package com.plateer.ec1.promotion.data;

public enum PromotionType {
    PRICE_DISCOUNT("priceDiscountCalculator"),
    PRODUCT_COUPON("productCouponCalculator"),
    CART_COUPON("cartCouponCalculator"),
    ;

    private String calculatorType;

    PromotionType(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    public String getCalculatorType() {
        return calculatorType;
    }

}
