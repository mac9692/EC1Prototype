package com.plateer.ec1.promotion.coupon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CouponUseCancel {

    private Long couponIssueNo;
    private String memberNo;

    public Long useCoupon() {
        log.info("CouponUseCancel - useCoupon");
        return null;
    }

    public Long cancelCoupon() {
        log.info("CouponUseCancel - cancelCoupon");
        return null;
    }
}
