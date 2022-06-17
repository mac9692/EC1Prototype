package com.plateer.ec1.order.serviceImpl;

import com.plateer.ec1.order.service.OrderService;
import com.plateer.ec1.order.strategy.after.AfterStrategy;
import com.plateer.ec1.order.strategy.data.DataStrategy;
import com.plateer.ec1.order.vo.OrderRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


public class OrderHistoryServiceImpl implements OrderService {

    @Override
    public void order(OrderRequest orderRequest) {

    }

    @Override
    public DataStrategy getDataStrategy(OrderRequest orderRequest) {
        return null;
    }

    @Override
    public AfterStrategy getAfterStrategy(OrderRequest orderRequest) {
        return null;
    }
}
