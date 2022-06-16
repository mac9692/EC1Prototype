package com.plateer.ec1.promotion.calculator;

import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.response.ResponseBaseVo;

public interface Calculator {
    public ResponseBaseVo getCalculationData(RequestPromotionVo requestPromotionVo);

}
