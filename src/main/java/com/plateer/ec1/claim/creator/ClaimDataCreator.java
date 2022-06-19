package com.plateer.ec1.claim.creator;

import com.plateer.ec1.claim.model.ClaimModel;
import com.plateer.ec1.claim.vo.Claim;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class ClaimDataCreator {

    public ClaimModel getInsertClaimData(Claim claim) {
        log.info("ClaimDataCreator - getInsertClaimData");
        ClaimModel claimModel = insertOrderClaim(null);
        ClaimModel claimModel2 = insertOrderCost(null);
        ClaimModel claimModel3 = insertOrderClaim(null);
        return null;
    }

    public ClaimModel getUpdateClaimData(Claim claim) {
        log.info("ClaimDataCreator - getUpdateClaimData");
        return null;
    }

    public abstract void updateOrderBenefitData(ClaimModel claimModel);

    public abstract ClaimModel insertOrderBenefitData(ClaimModel claimModel);

    public abstract void updateOrderCost(ClaimModel claimModel);

    public abstract ClaimModel insertOrderCost(ClaimModel claimModel);

    public abstract void updateOrderClaim(ClaimModel claimModel);

    public abstract ClaimModel insertOrderClaim(ClaimModel claimModel);



}
