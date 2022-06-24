package com.plateer.ec1.promotion.factory;

import com.plateer.ec1.promotion.calculator.Calculator;
import com.plateer.ec1.promotion.data.PromotionType;
import com.plateer.ec1.promotion.vo.Promotion;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.response.ResponseBaseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class CalculatorFactory {

    private Map<PromotionType, Calculator> promotionTypeCalculatorMap = new LinkedHashMap<>();
    private final List<Calculator> calculatorList;

    public CalculatorFactory(List<Calculator> calculatorList) {
        this.calculatorList = calculatorList;
    }

    @PostConstruct
    public void init() {
        calculatorList.forEach(c -> promotionTypeCalculatorMap.put(c.getType(), c));
    }

    public Calculator getPromotionCalculator(PromotionType promotionType) {
        return promotionTypeCalculatorMap.get(promotionType);
    }

}

