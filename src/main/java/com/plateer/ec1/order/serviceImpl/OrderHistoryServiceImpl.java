package com.plateer.ec1.order.serviceImpl;

import com.plateer.ec1.order.service.OrderHistoryService;
import com.plateer.ec1.order.service.OrderService;
import com.plateer.ec1.order.strategy.after.AfterStrategy;
import com.plateer.ec1.order.strategy.data.DataStrategy;
import com.plateer.ec1.order.vo.Order;
import com.plateer.ec1.order.vo.OrderRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class OrderHistoryServiceImpl implements OrderHistoryService {

    @Override
    public Long insertOrderHistory(OrderRequest orderRequest) {
        log.info("주문 모니터링 로그 생성 시작");
        log.info("주문 모니터링 로그 생성 종료");
        return null;
    }

    @Override
    public void updateOrderHistory(Long historyNo, Order order) {
        log.info("주문 모니터링 결과 업데이트");
    }
}
