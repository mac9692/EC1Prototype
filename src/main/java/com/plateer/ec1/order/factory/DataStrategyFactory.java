package com.plateer.ec1.order.factory;

import com.plateer.ec1.order.strategy.data.DataStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
public class DataStrategyFactory {

    private final Map<String, DataStrategy> dataStrategyTypeMap;

    public DataStrategyFactory(Map<String, DataStrategy> dataStrategyTypeMap) {
        this.dataStrategyTypeMap = dataStrategyTypeMap;
        log.info("DataStrategyFactory - DataStrategyFactory");
    }

    public DataStrategy getDataStrategy(String dataStrategyType) {
        DataStrategy dataStrategy = dataStrategyTypeMap.get(dataStrategyType);
        log.info("DataStrategyFactory - getDataStrategy");
        return dataStrategy;
    }
}
