package com.plateer.ec1.payment.service;

import com.plateer.ec1.payment.vo.*;

public interface PaymentService {
    public void validateAuth(PayInfo payInfo);

    public ApproveResponseVo approvePay(PayInfo payInfo);

    public void cancelPay(CancelRequestVo cancelRequestVo);

    public void netCancel(CancelRequestVo cancelRequestVo);
}
