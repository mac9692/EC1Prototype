package com.plateer.ec1.service.promotion;

import com.plateer.ec1.vo.promotion.*;

public class PriceDiscountCalculation implements Calculation{

    private Promotion getAvailablePromotionData(RequestPromotionVo requestPromotionVo) {
        System.out.println("PriceDiscountCalculation.getAvailablePromotionData");
        System.out.println("사용 가능한 프로모션 데이터 Get");
        return null;
    }

    private ResponsePriceDcVo calculateDcAmt(RequestPromotionVo requestPromotionVo, Promotion promotion) {
        System.out.println("PriceDiscountCalculation.calculateDcAmt");
        System.out.println("할인 금액 계산하기");
        return null;
    }

    private ResponsePriceDcVo calculateMaxBenefit(ResponseProductCouponVo responseProductCouponVo) {
        System.out.println("PriceDiscountCalculation.calculateMaxBenefit");
        System.out.println("최대 혜택 설정");
        return null;
    }
    @Override
    public ResponsePriceDcVo getCalculationData(RequestPromotionVo requestPromotionVo) {
        System.out.println("PriceDiscountCalculation.getCalculationData");
        System.out.println("============== 할인 금액 데이터 GET 시작 ==============");

        Promotion promotion = getAvailablePromotionData(requestPromotionVo);
        calculateDcAmt(requestPromotionVo, promotion);

        ResponsePriceDcVo responsePriceDcVo = new ResponsePriceDcVo();
        responsePriceDcVo.setMemberNo(requestPromotionVo.getMemberNo());
        responsePriceDcVo.setProductList(requestPromotionVo.getProductList());

        System.out.println(responsePriceDcVo);
        System.out.println("============== 할인 금액 데이터 GET 종료 ==============");
        return responsePriceDcVo;
    }
}
