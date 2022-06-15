package com.plateer.ec1.service.promotion;

import com.plateer.ec1.vo.promotion.RequestPromotionVo;
import com.plateer.ec1.vo.promotion.ResponseBaseVo;

public interface PromotionService {

    public ResponseBaseVo getPriceDiscountData(RequestPromotionVo requestPromotionVo);

    public ResponseBaseVo getProductCouponDiscountData(RequestPromotionVo requestPromotionVo);

    public ResponseBaseVo getCartCouponDiscountData(RequestPromotionVo requestPromotionVo);
}
