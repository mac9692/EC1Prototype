package com.plateer.ec1.promotion.calculator;

import com.plateer.ec1.promotion.data.PromotionType;
import com.plateer.ec1.promotion.vo.Promotion;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.response.ResponseBaseVo;
import com.plateer.ec1.promotion.vo.response.ResponsePriceDcVo;
import com.plateer.ec1.promotion.vo.response.ResponseProductCouponVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PriceDiscountCalculator implements Calculator {

    @Override
    public PromotionType getType() {
        return PromotionType.PRICE_DISCOUNT;
    }

    @Override
    public Promotion getAvailablePromotionData(RequestPromotionVo requestPromotionVo) {
        log.info("[가격 할인 적용] 회원별 적용 가능한 프로모션 조회");
        return null;
    }

    @Override
    public ResponsePriceDcVo calculateDcAmt(RequestPromotionVo requestPromotionVo, Promotion promotion) {
        log.info("[가격 할인 적용] 할인 금액 계산");
        return null;
    }

    @Override
    public ResponsePriceDcVo calculateMaxBenefit(ResponseBaseVo responseBaseVo) {
        log.info("[가격 할인 적용] 최대 할인 혜택 적용");
        return null;
    }

    @Override
    public ResponsePriceDcVo getCalculationData(RequestPromotionVo requestPromotionVo) {
        log.info("[가격 할인 적용 계산 시작]");
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
