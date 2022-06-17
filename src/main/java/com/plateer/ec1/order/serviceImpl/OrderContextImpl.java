package com.plateer.ec1.order.serviceImpl;

import com.plateer.ec1.order.service.OrderContext;
import com.plateer.ec1.order.service.OrderHistoryService;
import com.plateer.ec1.order.service.OrderRepository;
import com.plateer.ec1.order.strategy.after.AfterStrategy;
import com.plateer.ec1.order.strategy.data.DataStrategy;
import com.plateer.ec1.order.vo.Order;
import com.plateer.ec1.order.vo.OrderRequest;
import com.plateer.ec1.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

public class OrderContextImpl implements OrderContext {

//    private final OrderHistoryService orderHistoryService;
//    private final PaymentService paymentService;
//    private final OrderRepository orderRepository;

    @Override
    public void execute(DataStrategy dataStrategy, AfterStrategy afterStrategy, OrderRequest orderRequest) {

    }

    private void amountValidation(String orderNo) {

    }

    private void insertOrderData(Order order) {

    }
}
