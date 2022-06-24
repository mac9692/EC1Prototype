package com.plateer.ec1.order.factory;

import com.plateer.ec1.order.data.DataStrategyType;
import com.plateer.ec1.order.strategy.data.DataStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class DataStrategyFactory {

    private Map<DataStrategyType, DataStrategy> dataStrategyTypeMap = new LinkedHashMap<>();
    private final List<DataStrategy> dataStrategyList;

    public DataStrategyFactory(List<DataStrategy> dataStrategyList) {
        this.dataStrategyList = dataStrategyList;
    }

    @PostConstruct
    void init() {
        dataStrategyList.forEach(c -> dataStrategyTypeMap.put(c.getType(),c));
    }

    public DataStrategy getDataStrategy(DataStrategyType dataStrategyType) {
        log.info("주문 서비스에 맞는 전략 호출");
        return dataStrategyTypeMap.get(dataStrategyType);
    }
}
