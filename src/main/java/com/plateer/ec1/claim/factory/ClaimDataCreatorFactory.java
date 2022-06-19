package com.plateer.ec1.claim.factory;

import com.plateer.ec1.claim.creator.ClaimDataCreator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
public class ClaimDataCreatorFactory {

    private final Map<String, ClaimDataCreator> claimDataCreatorTypeMap;

    public ClaimDataCreatorFactory(Map<String, ClaimDataCreator> claimDataCreatorTypeMap) {
        this.claimDataCreatorTypeMap = claimDataCreatorTypeMap;
        log.info("ClaimDataCreatorFactory - ClaimDataCreatorFactory");
    }

    public ClaimDataCreator getClaimDataCreator(String claimDataCreatorType) {
        ClaimDataCreator claimDataCreator = claimDataCreatorTypeMap.get(claimDataCreatorType);
        log.info("ClaimDataCreatorFactory - ClaimDataCreatorFactory");
        return claimDataCreator;
    }
}
