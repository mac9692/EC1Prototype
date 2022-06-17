package com.plateer.ec1.payment.service;

import com.plateer.ec1.payment.vo.*;

public interface PayService {

    public ApproveResponseVo approve(PayInfo payInfo);

    public void cancel(CancelRequestVo cancelRequestVo);

    public void netCancel(CancelRequestVo cancelRequestVo);
}
