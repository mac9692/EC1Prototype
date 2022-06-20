package com.plateer.ec1.order.serviceImpl;

import com.plateer.ec1.order.service.OrderRepository;
import com.plateer.ec1.order.vo.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class OrderRepositoryImpl implements OrderRepository {


    public void insertOrderBase(Order order) {
        log.info("OrderRepositoryImpl - insertOrderBase");
    }

    public void insertOrderProduct(Order order) {
        log.info("OrderRepositoryImpl - insertOrderProduct");
    }

    public void insertOrderClaim(Order order) {
        log.info("OrderRepositoryImpl - insertOrderClaim");
    }
}
