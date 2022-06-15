package com.plateer.ec1.service.promotion;

import com.plateer.ec1.vo.promotion.*;

public class CartCouponCalculation implements Calculation{

    private Promotion getAvailablePromotionData(RequestPromotionVo requestPromotionVo) {
        System.out.println("PriceDiscountCalculation.getAvailablePromotionData");
        System.out.println("사용 가능한 프로모션 데이터 Get");
        return null;
    }

    private ResponseCartCouponVo calculateDcAmt(RequestPromotionVo requestPromotionVo, Promotion promotion) {
        System.out.println("PriceDiscountCalculation.calculateDcAmt");
        System.out.println("할인 금액 계산하기");
        return null;
    }

    private ResponseCartCouponVo calculateMaxBenefit(ResponseProductCouponVo responseProductCouponVo) {
        System.out.println("PriceDiscountCalculation.calculateMaxBenefit");
        System.out.println("최대 혜택 설정");
        return null;
    }
    @Override
    public ResponseCartCouponVo getCalculationData(RequestPromotionVo requestPromotionVo) {
        System.out.println("CartCouponCalculation.getCalculationData");
        System.out.println("============== 장바구니 쿠폰 할인 금액 데이터 GET 시작 ==============");

        Promotion promotion = getAvailablePromotionData(requestPromotionVo);
        calculateDcAmt(requestPromotionVo, promotion);

        ResponseCartCouponVo responseCartCouponVo = new ResponseCartCouponVo();
        responseCartCouponVo.setMemberNo(requestPromotionVo.getMemberNo());

        System.out.println(responseCartCouponVo);
        System.out.println("============== 장바구니 쿠폰 할인 금액 데이터 GET 종료 ==============");
        return responseCartCouponVo;
    }
}
