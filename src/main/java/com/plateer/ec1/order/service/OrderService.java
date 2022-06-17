package com.plateer.ec1.order.service;

import com.plateer.ec1.order.strategy.after.AfterStrategy;
import com.plateer.ec1.order.strategy.data.DataStrategy;
import com.plateer.ec1.order.vo.OrderRequest;

public interface OrderService {

    public void order(OrderRequest orderRequest);

    public DataStrategy getDataStrategy(OrderRequest orderRequest);

    public AfterStrategy getAfterStrategy(OrderRequest orderRequest);
}
