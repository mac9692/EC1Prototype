package com.plateer.ec1.promotion.coupon;

import com.plateer.ec1.promotion.vo.Promotion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DownloadCoupon {

    private Promotion promotion;
    private String memberNo;

    public boolean checkAvailableDownloadCoupon(String memberNo, Promotion promotion) {
        log.info("DownloadCoupon - checkAvailableDownloadCoupon");
        return false;
    }

    public Promotion downloadCoupon(String memberNo, Promotion promotion) {
        log.info("DownloadCoupon - downloadCoupon");
        return null;
    }

}
