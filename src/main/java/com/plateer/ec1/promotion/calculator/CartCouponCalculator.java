package com.plateer.ec1.promotion.calculator;

import com.plateer.ec1.promotion.data.PromotionType;
import com.plateer.ec1.promotion.vo.Promotion;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.response.ResponseBaseVo;
import com.plateer.ec1.promotion.vo.response.ResponseCartCouponVo;
import com.plateer.ec1.promotion.vo.response.ResponseProductCouponVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CartCouponCalculator implements Calculator {

    @Override
    public PromotionType getType() {
        return PromotionType.CART_COUPON;
    }

    @Override
    public Promotion getAvailablePromotionData(RequestPromotionVo requestPromotionVo) {
        log.info("[장바구니 쿠폰] 회원별 적용 가능한 쿠폰 조회 서비스 시작");
        log.info("쿠폰 적용 대상 여부 검증");
        log.info("매체 구분 일치 여부 검증");
        log.info("채널 일치 여부 검증");
        log.info("하나라도 검증 실패 시 : 종료");
        log.info("혜택 구분 = 할인?");
        log.info("할인이 아니면 포인트 적립");
        log.info("[장바구니 쿠폰] 회원별 적용 가능한 쿠폰 조회 서비스 종료");
        Promotion promotion = new Promotion();
        return promotion;
    }

    @Override
    public ResponseCartCouponVo calculateDcAmt(RequestPromotionVo requestPromotionVo, Promotion promotion) {
        log.info("[장바구니 쿠폰] 할인 금액 계산 서비스 시작");
        log.info("기 적용된 가격조정 확인");
        log.info("확인 성공 시 : 가격조정 금액 리턴");
        log.info("확인 실패 시 : 상품가격 리턴");
        log.info("쿠폰 할인금액 계산");
        log.info("하위 차수 쿠폰 여부 확인");
        log.info("확인되면 한번 더 쿠폰 할인금액 계산 반복");
        log.info("확인되지 않으면 계산 값 전달");
        log.info("[장바구니 쿠폰] 할인 금액 계산 서비스 종료");
        ResponseCartCouponVo responseCartCouponVo = new ResponseCartCouponVo();
        return responseCartCouponVo;
    }
    @Override
    public ResponseCartCouponVo calculateMaxBenefit(ResponseBaseVo responseBaseVo) {
        log.info("[장바구니 쿠폰] 최대 할인 혜택 적용 서비스 시작");
        ResponseCartCouponVo responseCartCouponVo = new ResponseCartCouponVo();
        log.info("[장바구니 쿠폰] 최대 할인 혜택 적용 서비스 종료");
        return responseCartCouponVo;
    }
    @Override
    public ResponseCartCouponVo getCalculationData(RequestPromotionVo requestPromotionVo) {
        log.info("[장바구니 쿠폰 계산 시작]");
        ResponseCartCouponVo responseCartCouponVo = calculateMaxBenefit(calculateDcAmt(requestPromotionVo, getAvailablePromotionData(requestPromotionVo)));
        log.info("[장바구니 쿠폰 계산 종료]");
        return null;
    }
}
