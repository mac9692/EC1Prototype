package com.plateer.ec1.promotion.coupon;

import com.plateer.ec1.promotion.vo.Promotion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DownloadAvailableCoupon {

    private String memberNo;
    private List<Promotion> promotionList;

    public List<Promotion> getDownloadAvailableCouponList(String memberNo) {
        log.info("DownloadAvailableCoupon - getDownloadAvailableCouponList");
        return null;
    }
}
