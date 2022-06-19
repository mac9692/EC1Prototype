package com.plateer.ec1.order.serviceImpl;

import com.plateer.ec1.order.service.OrderContext;
import com.plateer.ec1.order.service.OrderHistoryService;
import com.plateer.ec1.order.service.OrderRepository;
import com.plateer.ec1.order.strategy.after.AfterStrategy;
import com.plateer.ec1.order.strategy.data.DataStrategy;
import com.plateer.ec1.order.vo.Order;
import com.plateer.ec1.order.vo.OrderProductView;
import com.plateer.ec1.order.vo.OrderRequest;
import com.plateer.ec1.payment.service.PayService;
import com.plateer.ec1.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderContextImpl implements OrderContext {

    private final OrderHistoryService orderHistoryService;
    private final PayService payService;
    private final OrderRepository orderRepository;

    @Override
    public void execute(DataStrategy dataStrategy, AfterStrategy afterStrategy, OrderRequest orderRequest) {
        log.info("OrderContextImpl - execute");
        Long historyNo = orderHistoryService.insertOrderHistory(orderRequest);
        Order order = new Order();
        order = dataStrategy.create(orderRequest, new OrderProductView());
        insertOrderData(order);
        payService.approve(orderRequest.getPayInfo());
        amountValidation(orderRequest.getOrderNo());
        afterStrategy.call(orderRequest, order);
        orderHistoryService.updateOrderHistory(historyNo, order);

    }

    private void amountValidation(String orderNo) {
        log.info("OrderContextImpl - amountValidation");
    }

    private void insertOrderData(Order order) {
        log.info("OrderContextImpl - insertOrderData");
    }
}
