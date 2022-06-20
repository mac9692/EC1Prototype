package com.plateer.ec1.promotion.serviceImpl;

import com.plateer.ec1.promotion.service.CouponService;
import com.plateer.ec1.promotion.vo.Promotion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CouponServiceImpl implements CouponService {

    private String memberNo;
    private List<Promotion> promotionList;
    private Promotion promotion;
    private Long couponIssueNo;
    private String saveUseCcd;
    private int pointAmt;

    @Override
    public List<Promotion> getDownloadCouponList(String memberNo) {
        log.info("CouponServiceImpl - getDownloadCouponList");
        return null;
    }

    @Override
    public boolean checkAvailableDownloadCoupon(String memberNo, Promotion promotion) {
        log.info("CouponServiceImpl - checkAvailableDownloadCoupon");
        return false;
    }

    @Override
    public Promotion downloadCoupon(String memberNo, Promotion promotion) {
        log.info("CouponServiceImpl - downloadCoupon");
        return null;
    }

    @Override
    public Long useCoupon() {
        log.info("CouponServiceImpl - useCoupon");
        return null;
    }

    @Override
    public Long cancelCoupon() {
        log.info("CouponServiceImpl - cancelCoupon");
        return null;
    }

    @Override
    public boolean verifyCoupon() {
        log.info("CouponServiceImpl - verifyCoupon");
        return false;
    }
}
