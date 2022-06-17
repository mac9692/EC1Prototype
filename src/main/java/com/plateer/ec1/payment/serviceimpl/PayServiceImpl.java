package com.plateer.ec1.payment.serviceimpl;

import com.plateer.ec1.payment.factory.PaymentServiceFactory;
import com.plateer.ec1.payment.service.PayService;
import com.plateer.ec1.payment.service.PaymentService;
import com.plateer.ec1.payment.vo.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PayServiceImpl implements PayService {

    private final PaymentServiceFactory paymentServiceFactory;

    @Override
    public ApproveResponseVo approve(PayInfo payInfo) {
        log.info("PayServiceImpl - approve");
        PaymentService paymentService = paymentServiceFactory.getPaymentService(payInfo.getPaymentType());
        paymentService.validateAuth(payInfo);
        return paymentService.approvePay(payInfo);
    }

    @Override
    public void cancel(CancelRequestVo cancelRequestVo) {
        log.info("PayServiceImpl - cancel");
        PaymentService paymentService = paymentServiceFactory.getPaymentService(cancelRequestVo.getPaymentType());
        paymentService.cancelPay(cancelRequestVo);
    }

    @Override
    public void netCancel(CancelRequestVo cancelRequestVo) {
        log.info("PayServiceImpl - netCancel");
        PaymentService paymentService = paymentServiceFactory.getPaymentService(cancelRequestVo.getPaymentType());
        paymentService.netCancel(cancelRequestVo);
    }
}
