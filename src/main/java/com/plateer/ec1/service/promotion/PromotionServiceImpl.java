package com.plateer.ec1.service.promotion;

import com.plateer.ec1.vo.promotion.RequestPromotionVo;
import com.plateer.ec1.vo.promotion.ResponseBaseVo;
import org.springframework.stereotype.Service;


@Service
public class PromotionServiceImpl implements PromotionService{

    @Override
    public ResponseBaseVo getPriceDiscountData(RequestPromotionVo requestPromotionVo) {
        System.out.println("PromotionServiceImpl.getPriceDiscountData");
        return PromotionType.PRICEDISCOUNT.getPromotionType().getCalculationData(requestPromotionVo);
    }

    @Override
    public ResponseBaseVo getProductCouponDiscountData(RequestPromotionVo requestPromotionVo) {
        System.out.println("PromotionServiceImpl.getProductCouponDiscountData");
        return PromotionType.PRODUCTCOUPON.getPromotionType().getCalculationData(requestPromotionVo);
    }

    @Override
    public ResponseBaseVo getCartCouponDiscountData(RequestPromotionVo requestPromotionVo) {
        System.out.println("PromotionServiceImpl.getCartCouponDiscountData");
        return PromotionType.PRODUCTCOUPON.getPromotionType().getCalculationData(requestPromotionVo);
    }
}
