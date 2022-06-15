package com.plateer.ec1.promotion;


import com.plateer.ec1.controller.PromotionController;
import com.plateer.ec1.service.promotion.*;
import com.plateer.ec1.vo.Member;
import com.plateer.ec1.vo.Product;
import com.plateer.ec1.vo.promotion.Promotion;
import com.plateer.ec1.vo.promotion.RequestPromotionVo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PromotionTest {

    @Test
    @DisplayName("1. 가격할인금액계산 테스트")
    void priceDiscountCalculationTest() {
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


        Calculation calculation = new PriceDiscountCalculation();
        PromotionService promotionService = new PromotionServiceImpl();
        PromotionController promotionController = new PromotionController(promotionService);
        promotionController.getPriceDiscountApplyData(requestPromotionVo);

    }

    @Test
    @DisplayName("2. 상품쿠폰할인 테스트")
    void ProductCouponCalculationTest() {
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

        Calculation calculation = new ProductCouponCalculation();
        PromotionService promotionService = new PromotionServiceImpl();
        PromotionController promotionController = new PromotionController(promotionService);
        promotionController.getProductCouponApplyData(requestPromotionVo);

    }

    @Test
    @DisplayName("3. 장바구니쿠폰할인 테스트")
    void CartCouponCalculationTest() {
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

        Calculation calculation = new CartCouponCalculation();
        PromotionService promotionService = new PromotionServiceImpl();
        PromotionController promotionController = new PromotionController(promotionService);
        promotionController.getCartCouponApplyData(requestPromotionVo);
    }
}
