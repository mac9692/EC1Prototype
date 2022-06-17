package com.plateer.ec1.order.service;

import com.plateer.ec1.order.strategy.after.AfterStrategy;
import com.plateer.ec1.order.strategy.data.DataStrategy;
import com.plateer.ec1.order.vo.OrderRequest;

public interface OrderContext {

    public void execute(DataStrategy dataStrategy, AfterStrategy afterStrategy, OrderRequest orderRequest);
}
