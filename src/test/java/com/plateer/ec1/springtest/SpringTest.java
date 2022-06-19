package com.plateer.ec1.springtest;

import com.plateer.ec1.payment.data.PaymentType;
import com.plateer.ec1.payment.factory.PaymentServiceFactory;
import com.plateer.ec1.payment.service.PaymentService;
import com.plateer.ec1.payment.vo.PayInfo;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@TestMethodOrder(value = MethodOrderer.DisplayName.class)
@SpringBootTest
@Slf4j
public class SpringTest {

    @Autowired
    PaymentServiceFactory paymentServiceFactory;

    @Test
    @DisplayName("1. 빈 싱글톤 확인 테스트")
    void testBean() {
        log.info("1. 빈 싱글톤 확인 테스트 시작");
        PayInfo payInfo = new PayInfo();
        payInfo.setPaymentType(PaymentType.POINT);

        PaymentService paymentService1 = paymentServiceFactory.getPaymentService(payInfo.getPaymentType());
        PaymentService paymentService2 = paymentServiceFactory.getPaymentService(payInfo.getPaymentType());

        log.info(String.valueOf(paymentServiceFactory.getPaymentTypeMap()));
        log.info(String.valueOf(paymentService1));
        log.info(String.valueOf(paymentService2));
        //paymentService1 = paymentService2
        Assertions.assertThat(paymentService1).isSameAs(paymentService2);
        log.info("1. 빈 싱글톤 확인 테스트 종료");
    }
}
