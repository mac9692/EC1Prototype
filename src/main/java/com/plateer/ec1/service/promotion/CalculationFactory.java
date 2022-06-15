package com.plateer.ec1.service.promotion;

import org.springframework.stereotype.Service;

@Service
public class CalculationFactory {

    public static Calculation getCalculation(final String message) {
        return PromotionType.valueOf(message).create();
    }
}
