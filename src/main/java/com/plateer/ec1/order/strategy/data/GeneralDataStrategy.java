package com.plateer.ec1.order.strategy.data;

import com.plateer.ec1.order.vo.Order;
import com.plateer.ec1.order.vo.OrderProductView;
import com.plateer.ec1.order.vo.OrderRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GeneralDataStrategy implements DataStrategy{
    @Override
    public Order create(OrderRequest orderRequest, OrderProductView orderProductView) {
        log.info("GeneralDataStrategy - create");
        return null;
    }
}
