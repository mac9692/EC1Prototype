package com.plateer.ec1.claim.processor;

import com.plateer.ec1.claim.creator.ClaimDataCreator;
import com.plateer.ec1.claim.factory.ClaimDataCreatorFactory;
import com.plateer.ec1.claim.helper.IFCallHelper;
import com.plateer.ec1.claim.helper.MonitoringLogHelper;
import com.plateer.ec1.claim.validate.ClaimValidator;
import com.plateer.ec1.claim.vo.Claim;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CompleteProcessor extends ClaimProcessor{

    private final IFCallHelper ifCallHelper;
    private final ClaimDataCreatorFactory claimDataCreatorFactory;

    public CompleteProcessor(ClaimValidator claimValidator, ClaimDataCreator claimDataCreator, MonitoringLogHelper monitoringLogHelper, IFCallHelper ifCallHelper, ClaimDataCreatorFactory claimDataCreatorFactory) {
        super(claimValidator, claimDataCreator, monitoringLogHelper);
        this.ifCallHelper = ifCallHelper;
        this.claimDataCreatorFactory = claimDataCreatorFactory;
    }

    @Override
    public void doProcess(Claim claim) {
        log.info("CompleteProcessor - doProcess");
        ClaimDataCreator claimDataCreator = claimDataCreatorFactory.getClaimDataCreator(claim.getClaimType().getClaimDataCreatorType());
        ifCallHelper.callPaymentIF(claim);
        claimDataCreator.getInsertClaimData(claim);
    }
}
