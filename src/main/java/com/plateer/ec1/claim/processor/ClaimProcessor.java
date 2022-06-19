package com.plateer.ec1.claim.processor;

import com.plateer.ec1.claim.creator.ClaimDataCreator;
import com.plateer.ec1.claim.helper.MonitoringLogHelper;
import com.plateer.ec1.claim.validate.ClaimValidator;
import com.plateer.ec1.claim.vo.Claim;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
public abstract class ClaimProcessor {

    private final ClaimValidator claimValidator;
    private final ClaimDataCreator claimDataCreator;
    private final MonitoringLogHelper monitoringLogHelper;

    public Long insertMonitoringLog(Claim claim) {
        log.info("ClaimProcessor - insertMonitoringLog");
        claimDataCreator.getInsertClaimData(claim);
        return monitoringLogHelper.insertMonitoringLog(claim);
    }

    public void updateLog(Long logKey, Claim claim) {
        log.info("ClaimProcessor - updateLog");
        claimDataCreator.getUpdateClaimData(claim);
    }

    public void doValidationProcess(Claim claim) {
        log.info("ClaimProcessor - doValidationProcess");
        claimValidator.isValidStatus(claim);
        claimValidator.isValidAmount(claim);
        claimValidator.verifyAmount(claim);
    }

    public abstract void doProcess(Claim claim);
}
