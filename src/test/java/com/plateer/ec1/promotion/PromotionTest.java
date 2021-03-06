package com.plateer.ec1.promotion;

import com.plateer.ec1.promotion.controller.CouponController;
import com.plateer.ec1.promotion.controller.PointController;
import com.plateer.ec1.promotion.controller.PromotionController;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
@TestMethodOrder(value = MethodOrderer.DisplayName.class)
public class PromotionTest {

    @Autowired
    PromotionController promotionController;

    @Autowired
    CouponController couponController;

    @Autowired
    PointController pointController;

    @Test
    @DisplayName("1. 가격할인금액 계산 테스트")
    void priceDiscountCalculationTest() {
        log.info("1. 가격할인금액 계산 테스트 시작");
        RequestPromotionVo requestPromotionVo = new RequestPromotionVo();
        promotionController.getPriceDiscountApplyData(requestPromotionVo);
        log.info("1. 가격할인금액 계산 테스트 종료");
    }

    @Test
    @DisplayName("2. 상품쿠폰할인 계산 테스트")
    void productCouponCalculationTest() {
        log.info("2. 상품쿠폰할인 계산 테스트 시작");
        RequestPromotionVo requestPromotionVo = new RequestPromotionVo();
        promotionController.getProductCouponApplyData(requestPromotionVo);
        log.info("2. 상품쿠폰할인 계산 테스트 종료");
    }

    @Test
    @DisplayName("3. 장바구니쿠폰할인 계산 테스트")
    void cartCouponCalculationTest() {
        log.info("3. 장바구니쿠폰할인 계산 테스트 시작");
        RequestPromotionVo requestPromotionVo = new RequestPromotionVo();
        promotionController.getCartCouponApplyData(requestPromotionVo);
        log.info("3. 장바구니쿠폰할인 계산 테스트 종료");
    }

    @Test
    @DisplayName("4. 쿠폰 다운로드 테스트")
    void downloadAvailableCouponTest() {
        log.info("4. 쿠폰 다운로드 테스트 시작");
        RequestPromotionVo requestPromotionVo = new RequestPromotionVo();
        couponController.downloadCoupon(requestPromotionVo);
        log.info("4. 쿠폰 다운로드 테스트 종료");
    }

    @Test
    @DisplayName("5. 포인트 정보 조회 테스트")
    void getPointInfoTest() {
        log.info("5. 포인트 정보 조회 테스트 시작");
        RequestPromotionVo requestPromotionVo = new RequestPromotionVo();
        pointController.getPointInfo(requestPromotionVo);
        log.info("5. 포인트 정보 조회 테스트 종료");
    }

}
