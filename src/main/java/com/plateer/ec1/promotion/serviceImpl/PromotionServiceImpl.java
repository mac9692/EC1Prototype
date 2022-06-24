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
        log.info("가격 할인 서비스 호출");
        return calculatorFactory.getPromotionCalculator(PromotionType.PRICE_DISCOUNT).getCalculationData(requestPromotionVo);
    }

    @Override
    public ResponseBaseVo getProductCouponDiscountData(RequestPromotionVo requestPromotionVo) {
        log.info("상품쿠폰 할인 서비스 호출");
        return calculatorFactory.getPromotionCalculator(PromotionType.PRODUCT_COUPON).getCalculationData(requestPromotionVo);
    }

    @Override
    public ResponseBaseVo getCartCouponDiscountData(RequestPromotionVo requestPromotionVo) {
        log.info("장바구니 쿠폰 할인 서비스 호출");
        return calculatorFactory.getPromotionCalculator(PromotionType.CART_COUPON).getCalculationData(requestPromotionVo);
    }
}
