package com.plateer.ec1.claim.factory;

import com.plateer.ec1.claim.creator.ClaimDataCreator;
import com.plateer.ec1.claim.data.CreatorType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class ClaimDataCreatorFactory {

    private Map<CreatorType, ClaimDataCreator> claimDataCreatorTypeMap = new LinkedHashMap<>();
    private final List<ClaimDataCreator> claimDataCreatorList;

    public ClaimDataCreatorFactory(List<ClaimDataCreator> claimDataCreatorList) {
        this.claimDataCreatorList = claimDataCreatorList;
    }

    @PostConstruct
    public void init() {
        claimDataCreatorList.forEach(c -> claimDataCreatorTypeMap.put(c.getType(), c));
    }

    public ClaimDataCreator getClaimDataCreator(CreatorType creatorType) {
        log.info("클레임 종류에 맞는 데이터생성기 호출");
        return claimDataCreatorTypeMap.get(creatorType);
    }
}
