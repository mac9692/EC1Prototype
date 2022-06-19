package com.plateer.ec1.payment.factory;

import com.plateer.ec1.payment.data.PaymentType;
import com.plateer.ec1.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class PaymentServiceFactory {

    private final Map<String, PaymentService> paymentTypeMap;

    public PaymentServiceFactory(Map<String, PaymentService> paymentTypeMap) {
        this.paymentTypeMap = paymentTypeMap;
        log.info("PaymentServiceFactory - PaymentServiceFactory");
    }

    public Map<String, PaymentService> getPaymentTypeMap() {
        return paymentTypeMap;
    }

    public PaymentService getPaymentService(PaymentType paymentType) {
        log.info("PaymentServiceFactory - getPaymentService");
        if (paymentType == PaymentType.POINT) {
            return paymentTypeMap.get(PaymentType.POINT.getPaymentType());
        } else if (paymentType == PaymentType.INICIS) {
            return paymentTypeMap.get(PaymentType.INICIS.getPaymentType());
        } else {
            return null;
        }
    }

}
