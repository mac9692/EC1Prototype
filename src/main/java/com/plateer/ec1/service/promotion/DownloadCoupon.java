package com.plateer.ec1.service.promotion;

import com.plateer.ec1.vo.promotion.Promotion;

public class DownloadCoupon {

    private Promotion promotion;
    private String memberNo;

    public boolean checkAvailableDownloadCoupon(String memberNo, Promotion promotion) {
        return false;
    }

    public Promotion downloadCoupon(String memberNo, Promotion promotion) {
        return null;
    }

}
