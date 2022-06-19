package com.plateer.ec1.order.vo;

import com.plateer.ec1.order.data.OrderType;
import com.plateer.ec1.order.data.SystemType;
import com.plateer.ec1.payment.vo.PayInfo;
import lombok.Data;

@Data
public class OrderRequest {
    private String orderNo;
    private OrderType orderType;
    private SystemType systemType;
    private PayInfo payInfo;
}
