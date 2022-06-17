package com.plateer.ec1.claim.processor;

import com.plateer.ec1.claim.vo.Claim;

public interface ClaimProcessor {

    void doValidationProcess(Claim claim);

    void doClaimDataManipulateProcess(Claim claim);

    void verifyAmount(Claim claim);

    void doProcess(Claim claim);
}
