package com.plateer.ec1.promotion.serviceImpl;

import com.plateer.ec1.promotion.data.PromotionType;
import com.plateer.ec1.promotion.factory.CalculatorFactory;
import com.plateer.ec1.promotion.service.PromotionService;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.response.ResponseBaseVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class PromotionServiceImpl implements PromotionService {
    private final CalculatorFactory calculatorFactory;

    @Override
    public ResponseBaseVo getPriceDiscountData(RequestPromotionVo requestPromotionVo) {
        log.info("PromotionServiceImpl - getPriceDiscountData");
        return calculatorFactory.getPromotionCalculator(requestPromotionVo, PromotionType.PRICE_DISCOUNT.getCalculatorType());
    }

    @Override
    public ResponseBaseVo getProductCouponDiscountData(RequestPromotionVo requestPromotionVo) {
        log.info("PromotionServiceImpl - getProductCouponDiscountData");
        return calculatorFactory.getPromotionCalculator(requestPromotionVo, PromotionType.PRODUCT_COUPON.getCalculatorType());
    }

    @Override
    public ResponseBaseVo getCartCouponDiscountData(RequestPromotionVo requestPromotionVo) {
        log.info("PromotionServiceImpl - getCartCouponDiscountData");
        return calculatorFactory.getPromotionCalculator(requestPromotionVo, PromotionType.CART_COUPON.getCalculatorType());
    }
}
