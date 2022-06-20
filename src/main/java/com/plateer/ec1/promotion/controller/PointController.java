package com.plateer.ec1.promotion.controller;

import com.plateer.ec1.promotion.service.PointService;
import com.plateer.ec1.promotion.vo.PointVo;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api")
@Slf4j
public class PointController {

    private final PointService pointService;

    @RequestMapping(path = "getPointInfo")
    public PointVo getPointInfo(RequestPromotionVo requestPromotionVo) {
        log.info("PointController - getPointInfo");
        return pointService.getPointInfo(requestPromotionVo.getClnNo());
    }

    @RequestMapping(path = "savePoint")
    public PointVo savePoint(RequestPromotionVo requestPromotionVo) {
        log.info("PointController - savePoint");
        return pointService.savePoint(requestPromotionVo.getClnNo(), requestPromotionVo.getPointAmt());
    }

    @RequestMapping(path = "usePoint")
    public PointVo usePoint(RequestPromotionVo requestPromotionVo) {
        log.info("PointController - usePoint");
        return pointService.usePoint(requestPromotionVo.getClnNo(), requestPromotionVo.getPointAmt());
    }

    @RequestMapping(path = "cancelPoint")
    public PointVo cancelPoint(RequestPromotionVo requestPromotionVo) {
        log.info("PointController - cancelPoint");
        return pointService.cancelPoint(requestPromotionVo.getClnNo(), requestPromotionVo.getPointAmt());
    }
}
