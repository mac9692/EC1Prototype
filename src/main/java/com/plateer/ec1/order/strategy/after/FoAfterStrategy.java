package com.plateer.ec1.order.strategy.after;

import com.plateer.ec1.order.vo.Order;
import com.plateer.ec1.order.vo.OrderRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FoAfterStrategy implements AfterStrategy {
    @Override
    public void call(OrderRequest orderRequest, Order order) {
        log.info("FoAfterStrategy - call");
    }
}
