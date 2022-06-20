package com.plateer.ec1.promotion.calculator;

import com.plateer.ec1.promotion.vo.Promotion;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.response.ResponsePriceDcVo;
import com.plateer.ec1.promotion.vo.response.ResponseProductCouponVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PriceDiscountCalculator implements Calculator {

    private Promotion getAvailablePromotionData(RequestPromotionVo requestPromotionVo) {
        log.info("CartCouponCalculator - getAvailablePromotionData");
        return null;
    }

    private ResponsePriceDcVo calculateDcAmt(RequestPromotionVo requestPromotionVo, Promotion promotion) {
        log.info("CartCouponCalculator - calculateDcAmt");
        return null;
    }

    private ResponsePriceDcVo calculateMaxBenefit(ResponseProductCouponVo responseProductCouponVo) {
        log.info("CartCouponCalculator - calculateMaxBenefit");
        return null;
    }
    @Override
    public ResponsePriceDcVo getCalculationData(RequestPromotionVo requestPromotionVo) {
        log.info("CartCouponCalculator - getCalculationData");
        Promotion promotion = getAvailablePromotionData(requestPromotionVo);
        calculateDcAmt(requestPromotionVo, promotion);
        calculateMaxBenefit(null);
        ResponsePriceDcVo responsePriceDcVo = new ResponsePriceDcVo();
        responsePriceDcVo.setMemberNo(requestPromotionVo.getMemberNo());
        responsePriceDcVo.setProductList(requestPromotionVo.getProductList());
        log.info(String.valueOf(responsePriceDcVo));
        return responsePriceDcVo;
    }
}
