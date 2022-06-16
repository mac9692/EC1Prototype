package com.plateer.ec1.promotion.calculator;

import com.plateer.ec1.promotion.vo.Promotion;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.response.ResponseCartCouponVo;
import com.plateer.ec1.promotion.vo.response.ResponseProductCouponVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@RequiredArgsConstructor
@Slf4j
public class CartCouponCalculator implements Calculator {

    private Promotion getAvailablePromotionData(RequestPromotionVo requestPromotionVo) {
        log.info("CartCouponCalculator - getAvailablePromotionData");
        return null;
    }

    private ResponseCartCouponVo calculateDcAmt(RequestPromotionVo requestPromotionVo, Promotion promotion) {
        log.info("CartCouponCalculator - calculateDcAmt");
        return null;
    }

    private ResponseCartCouponVo calculateMaxBenefit(ResponseProductCouponVo responseProductCouponVo) {
        log.info("CartCouponCalculator - calculateMaxBenefit");
        return null;
    }
    @Override
    public ResponseCartCouponVo getCalculationData(RequestPromotionVo requestPromotionVo) {
        log.info("CartCouponCalculator - getCalculationData");
        Promotion promotion = getAvailablePromotionData(requestPromotionVo);
        calculateDcAmt(requestPromotionVo, promotion);
        calculateMaxBenefit(null);
        ResponseCartCouponVo responseCartCouponVo = new ResponseCartCouponVo();
        responseCartCouponVo.setMemberNo(requestPromotionVo.getMemberNo());
        return responseCartCouponVo;
    }
}
