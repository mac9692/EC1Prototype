package com.plateer.ec1.promotion.calculator;

import com.plateer.ec1.promotion.data.PromotionType;
import com.plateer.ec1.promotion.vo.Promotion;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.response.ResponseBaseVo;
import com.plateer.ec1.promotion.vo.response.ResponseCartCouponVo;
import com.plateer.ec1.promotion.vo.response.ResponseProductCouponVo;

public interface Calculator {

    PromotionType getType();

    Promotion getAvailablePromotionData(RequestPromotionVo requestPromotionVo);

    ResponseBaseVo calculateDcAmt(RequestPromotionVo requestPromotionVo, Promotion promotion);

    ResponseBaseVo calculateMaxBenefit(ResponseBaseVo responseBaseVo);

    ResponseBaseVo getCalculationData(RequestPromotionVo requestPromotionVo);

}
