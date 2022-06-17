package com.plateer.ec1.promotion.coupon;

import com.plateer.ec1.promotion.vo.PointVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PointManager {

    private String memberNo;
    private String saveUseCcd;
    private Integer pointAmt;

    public PointVo getPointInfo(String clnNo) {
        log.info("PointManager - getPointInfo");
        return null;
    }

    public PointVo savePoint(String clnNo, Integer pointAmt) {
        log.info("PointManager - savePoint");
        return null;
    }

    public PointVo usePoint(String clnNo, Integer pointAmt) {
        log.info("PointManager - usePoint");
        return null;
    }

    public PointVo cancelPoint(String clnNo, Integer pointAmt) {
        log.info("PointManager - cancelPoint");
        return null;
    }
}
