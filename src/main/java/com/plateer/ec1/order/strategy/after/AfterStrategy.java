package com.plateer.ec1.order.strategy.after;

import com.plateer.ec1.order.vo.Order;
import com.plateer.ec1.order.vo.OrderRequest;

public interface AfterStrategy {

    void call(OrderRequest orderRequest, Order order);
}
