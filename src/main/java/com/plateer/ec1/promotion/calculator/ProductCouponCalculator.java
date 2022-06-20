package com.plateer.ec1.promotion.calculator;

import com.plateer.ec1.promotion.vo.Promotion;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.response.ResponseProductCouponVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProductCouponCalculator implements Calculator {

    private Promotion getAvailablePromotionData(RequestPromotionVo requestPromotionVo) {
        log.info("CartCouponCalculator - getAvailablePromotionData");
        return null;
    }

    private ResponseProductCouponVo calculateDcAmt(RequestPromotionVo requestPromotionVo, Promotion promotion) {
        log.info("CartCouponCalculator - calculateDcAmt");
        return null;
    }

    private ResponseProductCouponVo calculateMaxBenefit(ResponseProductCouponVo responseProductCouponVo) {
        log.info("CartCouponCalculator - calculateMaxBenefit");
        return null;
    }
    @Override
    public ResponseProductCouponVo getCalculationData(RequestPromotionVo requestPromotionVo) {
        log.info("CartCouponCalculator - getCalculationData");
        Promotion promotion = getAvailablePromotionData(null);
        calculateDcAmt(requestPromotionVo, promotion);
        calculateMaxBenefit(null);
        ResponseProductCouponVo responseProductCouponVo = new ResponseProductCouponVo();
        responseProductCouponVo.setMemberNo(requestPromotionVo.getMemberNo());
        return responseProductCouponVo;
    }
}
