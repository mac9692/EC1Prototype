package com.plateer.ec1.order;

import com.plateer.ec1.order.controller.OrderController;
import com.plateer.ec1.order.data.DataStrategyType;
import com.plateer.ec1.order.data.AfterStrategyType;
import com.plateer.ec1.order.vo.OrderRequest;
import com.plateer.ec1.payment.data.PaymentType;
import com.plateer.ec1.payment.vo.PayInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
@TestMethodOrder(value = MethodOrderer.DisplayName.class)
public class OrderTest {

    @Autowired
    OrderController orderController;

    @Test
    @DisplayName("1. 주문 테스트 - Ecoupon, BO, POINT")
    void orderTest() {
        OrderRequest orderRequest = new OrderRequest();
        PayInfo payInfo = new PayInfo();
        payInfo.setPaymentType(PaymentType.POINT);
        orderRequest.setOrderType(DataStrategyType.ECOUPON);
        orderRequest.setSystemType(AfterStrategyType.BO);
        orderRequest.setPayInfo(payInfo);
        orderController.order(orderRequest);
    }

    @Test
    @DisplayName("2. 주문 테스트 - GENERAL, FO, INICIS")
    void orderTest2() {
        OrderRequest orderRequest = new OrderRequest();
        PayInfo payInfo = new PayInfo();
        payInfo.setPaymentType(PaymentType.INICIS);
        orderRequest.setOrderType(DataStrategyType.GENERAL);
        orderRequest.setSystemType(AfterStrategyType.FO);
        orderRequest.setPayInfo(payInfo);
        orderController.order(orderRequest);
    }
}
