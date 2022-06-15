package com.plateer.ec1.service.promotion;

public enum PromotionType {

    PRICEDISCOUNT(new PriceDiscountCalculation()),
    PRODUCTCOUPON(new ProductCouponCalculation()),
    CARTCOUPON(new CartCouponCalculation());

    private Calculation calculation;
    PromotionType(Calculation calculation) {
        this.calculation = calculation;
    }

    public Calculation getPromotionType() {
        return calculation;
    }
}
