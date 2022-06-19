package com.plateer.ec1.order.factory;

import com.plateer.ec1.order.strategy.after.AfterStrategy;
import com.plateer.ec1.order.strategy.data.DataStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class AfterStrategyFactory {

    private final Map<String, AfterStrategy> afterStrategyTypeMap;

    public AfterStrategyFactory(Map<String, AfterStrategy> afterStrategyTypeMap) {
        this.afterStrategyTypeMap = afterStrategyTypeMap;
        log.info("AfterStrategyFactory - AfterStrategyFactory");
    }

    public AfterStrategy getAfterStrategy(String afterStrategyType) {
        AfterStrategy afterStrategy = afterStrategyTypeMap.get(afterStrategyType);
        log.info("AfterStrategyFactory - getAfterStrategy");
        return afterStrategy;
    }
}
