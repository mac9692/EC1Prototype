package com.plateer.ec1.controller;

import com.plateer.ec1.service.promotion.PromotionService;
import com.plateer.ec1.vo.promotion.RequestPromotionVo;
import com.plateer.ec1.vo.promotion.ResponseBaseVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api")
public class PromotionController {

    private final PromotionService promotionService;

    @RequestMapping(value = "priceDiscount")
    public ResponseBaseVo getPriceDiscountApplyData(RequestPromotionVo requestPromotionVo) {
        System.out.println("PromotionController.getPromotionApplyData");
        return promotionService.getPriceDiscountData(requestPromotionVo);
    }

    @RequestMapping(value = "productCoupon")
    public ResponseBaseVo getProductCouponApplyData(RequestPromotionVo requestPromotionVo) {
        System.out.println("PromotionController.getPromotionApplyData");
        return promotionService.getProductCouponDiscountData(requestPromotionVo);
    }
    @RequestMapping(value = "cartCoupon")
    public ResponseBaseVo getCartCouponApplyData(RequestPromotionVo requestPromotionVo) {
        System.out.println("PromotionController.getPromotionApplyData");
        return promotionService.getCartCouponDiscountData(requestPromotionVo);
    }

}
