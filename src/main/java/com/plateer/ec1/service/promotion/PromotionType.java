package com.plateer.ec1.service.promotion;

public enum PromotionType {

    priceDiscount("priceDiscount") {
        @Override
        Calculation create() {
            return new PriceDiscountCalculation();
        }
    },
    productCoupon("productCoupon") {
        @Override
        Calculation create() {
            return new ProductCouponCalculation();
        }
    },
    cartCoupon("cartCoupon") {
        @Override
        Calculation create() {
            return new CartCouponCalculation();
        }
    };

    private final String type;
    PromotionType(String type) {
        this.type = type;
    }

    abstract Calculation create();

}
