package com.plateer.ec1.order.vo;

import com.plateer.ec1.order.data.DataStrategyType;
import com.plateer.ec1.order.data.AfterStrategyType;
import com.plateer.ec1.payment.vo.PayInfo;
import lombok.Data;

@Data
public class OrderRequest {
    private String orderNo;
    private DataStrategyType orderType;
    private AfterStrategyType systemType;
    private PayInfo payInfo;
}
