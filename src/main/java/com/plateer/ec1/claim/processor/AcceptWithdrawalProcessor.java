package com.plateer.ec1.claim.processor;

import com.plateer.ec1.claim.creator.ClaimDataCreator;
import com.plateer.ec1.claim.factory.ClaimDataCreatorFactory;
import com.plateer.ec1.claim.helper.MonitoringLogHelper;
import com.plateer.ec1.claim.validate.ClaimValidator;
import com.plateer.ec1.claim.vo.Claim;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AcceptWithdrawalProcessor extends ClaimProcessor{

    private ClaimDataCreatorFactory claimDataCreatorFactory;

    public AcceptWithdrawalProcessor(ClaimValidator claimValidator, ClaimDataCreator claimDataCreator, MonitoringLogHelper monitoringLogHelper, ClaimDataCreatorFactory claimDataCreatorFactory) {
        super(claimValidator, claimDataCreator, monitoringLogHelper);
        this.claimDataCreatorFactory = claimDataCreatorFactory;
    }

    @Override
    public void doProcess(Claim claim) {
        log.info("AcceptWithdrawalProcessor - doProcess");
        ClaimDataCreator claimDataCreator = claimDataCreatorFactory.getClaimDataCreator(claim.getClaimType().getClaimDataCreatorType());
        claimDataCreator.getInsertClaimData(claim);
    }
}
