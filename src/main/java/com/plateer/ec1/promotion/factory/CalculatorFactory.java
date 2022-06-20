package com.plateer.ec1.promotion.factory;

import com.plateer.ec1.promotion.calculator.Calculator;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.response.ResponseBaseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
public class CalculatorFactory {

    private final Map<String, Calculator> promotionTypeCalculatorMap;

    public CalculatorFactory(Map<String, Calculator> promotionTypeCalculatorMap) {
        this.promotionTypeCalculatorMap = promotionTypeCalculatorMap;
        log.info("CalculatorFactory - CalculatorFactory");
    }

    public ResponseBaseVo getPromotionCalculator(RequestPromotionVo requestPromotionVo, String calculatorType) {
        Calculator calculator = promotionTypeCalculatorMap.get(calculatorType);
        log.info("CalculatorFactory - getPromotionCalculator");
        return calculator.getCalculationData(requestPromotionVo);
    }

}

