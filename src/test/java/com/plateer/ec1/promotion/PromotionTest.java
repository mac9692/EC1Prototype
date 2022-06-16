package com.plateer.ec1.promotion;

import com.plateer.ec1.promotion.service.PromotionService;
import com.plateer.ec1.member.vo.Member;
import com.plateer.ec1.product.vo.Product;
import com.plateer.ec1.promotion.vo.Promotion;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootTest
public class PromotionTest {

    @Autowired
    PromotionService promotionService;

    @Test
    @DisplayName("1. 가격할인금액 계산 테스트")
    void priceDiscountCalculationTest() {
        log.info("1. 가격할인금액 계산 테스트 시작");
        //상품 1 설정
        Product product1 = new Product();
        product1.setProductNo("1");
        product1.setProductAmt(5000);
        //상품 2 설정
        Product product2 = new Product();
        product2.setProductNo("2");
        product2.setProductAmt(10000);
        //회원 설정
        Member member1 = new Member();
        member1.setMemberNo("12");
        member1.setMemberName("박진성");
        //프로모션 설정
        Promotion promotion = new Promotion();
        promotion.setPromotionNo(1L);
        promotion.setCouponIssueNo(10L);
        promotion.setDcAmt(10L);
        //RequestVO 설정
        RequestPromotionVo requestPromotionVo = new RequestPromotionVo();
        requestPromotionVo.setMemberNo(member1.getMemberNo());
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        requestPromotionVo.setProductList(productList);
        requestPromotionVo.setCouponIssueNo(promotion.getCouponIssueNo());

        promotionService.getPriceDiscountData(requestPromotionVo);
        log.info("1. 가격할인금액 계산 테스트 종료");
    }

    @Test
    @DisplayName("2. 상품쿠폰할인 계산 테스트")
    void productCouponCalculationTest() {
        log.info("2. 상품쿠폰할인 계산 테스트 시작");
        RequestPromotionVo requestPromotionVo = new RequestPromotionVo();
        promotionService.getProductCouponDiscountData(requestPromotionVo);
        log.info("2. 상품쿠폰할인 계산 테스트 종료");
    }

    @Test
    @DisplayName("3. 장바구니쿠폰할인 계산 테스트")
    void cartCouponCalculationTest() {
        log.info("3. 장바구니쿠폰할인 계산 테스트 시작");
        RequestPromotionVo requestPromotionVo = new RequestPromotionVo();
        promotionService.getCartCouponDiscountData(requestPromotionVo);
        log.info("3. 장바구니쿠폰할인 계산 테스트 종료");
    }

}
