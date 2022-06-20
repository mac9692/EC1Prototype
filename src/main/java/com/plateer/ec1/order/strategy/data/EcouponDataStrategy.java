package com.plateer.ec1.order.strategy.data;

import com.plateer.ec1.order.vo.Order;
import com.plateer.ec1.order.vo.OrderProductView;
import com.plateer.ec1.order.vo.OrderRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EcouponDataStrategy implements DataStrategy{
    @Override
    public Order create(OrderRequest orderRequest, OrderProductView orderProductView) {
        log.info("EcouponDataStrategy - create");
        return null;
    }
}
