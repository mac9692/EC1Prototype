package com.plateer.ec1.order.serviceImpl;

import com.plateer.ec1.order.factory.AfterStrategyFactory;
import com.plateer.ec1.order.factory.DataStrategyFactory;
import com.plateer.ec1.order.service.OrderContext;
import com.plateer.ec1.order.service.OrderHistoryService;
import com.plateer.ec1.order.service.OrderService;
import com.plateer.ec1.order.strategy.after.AfterStrategy;
import com.plateer.ec1.order.strategy.data.DataStrategy;
import com.plateer.ec1.order.vo.OrderRequest;
import com.plateer.ec1.payment.service.PayService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    private final AfterStrategyFactory afterStrategyFactory;
    private final DataStrategyFactory dataStrategyFactory;
    private final OrderContext orderContext;


    @Override
    public void order(OrderRequest orderRequest) {
        log.info("OrderServiceImpl - order");
        orderContext.execute(getDataStrategy(orderRequest), getAfterStrategy(orderRequest), orderRequest);
    }

    @Override
    public DataStrategy getDataStrategy(OrderRequest orderRequest) {
        log.info("OrderServiceImpl - getDataStrategy");
        return dataStrategyFactory.getDataStrategy(orderRequest.getOrderType().getOrderType());
    }

    @Override
    public AfterStrategy getAfterStrategy(OrderRequest orderRequest) {
        log.info("OrderServiceImpl - getAfterStrategy");
        return afterStrategyFactory.getAfterStrategy(orderRequest.getSystemType().getSystemType());
    }
}
