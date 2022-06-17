package com.plateer.ec1.payment.serviceimpl;

import com.plateer.ec1.payment.service.PaymentService;
import com.plateer.ec1.payment.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Inicis implements PaymentService {
    @Override
    public void validateAuth(PayInfo payInfo) {
        log.info("Inicis - validateAuth");
    }

    @Override
    public ApproveResponseVo approvePay(PayInfo payInfo) {
        log.info("Inicis - approvePay");
        return null;
    }

    @Override
    public void cancelPay(CancelRequestVo cancelRequestVo) {
        log.info("Inicis - cancelPay");
    }

    @Override
    public void netCancel(CancelRequestVo cancelRequestVo) {
        log.info("Inicis - netCancel");
    }
}
