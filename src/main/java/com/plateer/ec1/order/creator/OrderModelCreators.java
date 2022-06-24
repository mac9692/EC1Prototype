package com.plateer.ec1.order.creator;

import com.plateer.ec1.order.model.OrderBaseModel;
import com.plateer.ec1.order.model.OrderClaimModel;
import com.plateer.ec1.order.model.OrderProductModel;
import com.plateer.ec1.order.vo.OrderProductView;
import com.plateer.ec1.order.vo.OrderRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
public class OrderModelCreators {

    public static OrderBaseModel commonOrderBase(OrderRequest orderRequest, OrderProductView orderProductView) {
        log.info("주문 데이터 생성 : 주문 기본 생성");
        return null;
    }

    public static OrderProductModel commonOrderProduct(OrderRequest orderRequest, OrderProductView orderProductView) {
        log.info("주문 데이터 생성 : 주문 상품 생성");
        return null;
    }

    public static OrderClaimModel commonOrderClaim(OrderRequest orderRequest, OrderProductView orderProductView) {
        log.info("주문 데이터 생성 : 주문 클레임 생성");
        return null;
    }
}
