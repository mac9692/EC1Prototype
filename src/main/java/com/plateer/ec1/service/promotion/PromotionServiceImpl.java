package com.plateer.ec1.service.promotion;

import com.plateer.ec1.vo.promotion.RequestPromotionVo;
import com.plateer.ec1.vo.promotion.ResponseBaseVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
public class PromotionServiceImpl implements PromotionService{

    @Override
    public ResponseBaseVo getPriceDiscountData(RequestPromotionVo requestPromotionVo) {
        Calculation calculation = CalculationFactory.getCalculation("priceDiscount");
        return calculation.getCalculationData(requestPromotionVo);
    }

    @Override
    public ResponseBaseVo getProductCouponDiscountData(RequestPromotionVo requestPromotionVo) {
        Calculation calculation = CalculationFactory.getCalculation("productCoupon");
        return calculation.getCalculationData(requestPromotionVo);
    }

    @Override
    public ResponseBaseVo getCartCouponDiscountData(RequestPromotionVo requestPromotionVo) {
        Calculation calculation = CalculationFactory.getCalculation("cartCoupon");
        return calculation.getCalculationData(requestPromotionVo);
    }
}
