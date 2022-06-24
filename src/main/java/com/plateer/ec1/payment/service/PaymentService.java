package com.plateer.ec1.payment.service;

import com.plateer.ec1.payment.data.PaymentType;
import com.plateer.ec1.payment.vo.*;

public interface PaymentService {

    PaymentType getType();
    void validateAuth(PayInfo payInfo);

    ApproveResponseVo approvePay(PayInfo payInfo);

    void cancelPay(CancelRequestVo cancelRequestVo);

    void netCancel(CancelRequestVo cancelRequestVo);
}
