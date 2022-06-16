package com.plateer.ec1.promotion.factory;

import com.plateer.ec1.promotion.calculator.Calculator;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.response.ResponseBaseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class CalculatorFactory {

//    private final Calculator calculator;
//
//    public ResponseBaseVo getPromotionCalculator(RequestPromotionVo requestPromotionVo) {
//        log.info("PromotionFactory - getPromotionCalculator");
//        return calculator.getCalculationData(requestPromotionVo);
//    }

    private final Map<String, Calculator> promotionTypeCalculatorMap;
    private final List<Calculator> calculatorList;

    public CalculatorFactory(Map<String, Calculator> promotionTypeCalculatorMap, List<Calculator> calculatorList) {
        this.promotionTypeCalculatorMap = promotionTypeCalculatorMap;
        this.calculatorList = calculatorList;
        log.info(String.valueOf(promotionTypeCalculatorMap));
        log.info(String.valueOf(calculatorList));
    }

    public ResponseBaseVo getPromotionCalculator(RequestPromotionVo requestPromotionVo, String calculatorType) {
        Calculator calculator = promotionTypeCalculatorMap.get(calculatorType);

        log.info(calculatorType);
        log.info(String.valueOf(calculator));

        return calculator.getCalculationData(requestPromotionVo);
    }

}

