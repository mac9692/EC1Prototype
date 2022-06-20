package com.plateer.ec1.promotion.serviceImpl;

import com.plateer.ec1.promotion.service.PointService;
import com.plateer.ec1.promotion.vo.PointVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PointServiceImpl implements PointService {

    private String memberNo;
    private String saveUseCcd;
    private int pointAmt;

    @Override
    public PointVo getPointInfo(String clnNo) {
        log.info("PointServiceImpl - getPointInfo");
        return null;
    }

    @Override
    public PointVo savePoint(String clnNo, int pointAmt) {
        log.info("PointServiceImpl - savePoint");
        return null;
    }

    @Override
    public PointVo usePoint(String clnNo, int pointAmt) {
        log.info("PointServiceImpl - usePoint");
        return null;
    }

    @Override
    public PointVo cancelPoint(String clnNo, int pointAmt) {
        log.info("PointServiceImpl - cancelPoint");
        return null;
    }
}
