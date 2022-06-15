package com.plateer.ec1.service.promotion;

import com.plateer.ec1.vo.promotion.RequestPromotionVo;
import com.plateer.ec1.vo.promotion.ResponseBaseVo;

public interface Calculation {
    public ResponseBaseVo getCalculationData(RequestPromotionVo requestPromotionVo);

}
