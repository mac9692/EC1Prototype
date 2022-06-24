package com.plateer.ec1.claim.processor;

import com.plateer.ec1.claim.data.ProcessorType;
import com.plateer.ec1.claim.vo.Claim;

public interface ClaimProcessor {

    ProcessorType getType();

    void doProcess(Claim claim);
}
