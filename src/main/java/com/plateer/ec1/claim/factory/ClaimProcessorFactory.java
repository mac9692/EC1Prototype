package com.plateer.ec1.claim.factory;

import com.plateer.ec1.claim.processor.ClaimProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
public class ClaimProcessorFactory {

    private final Map<String, ClaimProcessor> claimTypeMap;

    public ClaimProcessorFactory(Map<String, ClaimProcessor> claimTypeMap) {
        this.claimTypeMap = claimTypeMap;
        log.info("ClaimProcessorFactory - CalculatorFactory");
    }

    public ClaimProcessor getClaimProcessor(String calculatorType) {
        ClaimProcessor claimProcessor = claimTypeMap.get(calculatorType);
        log.info("ClaimProcessorFactory - getPromotionCalculator");
        return claimProcessor;
    }
}
