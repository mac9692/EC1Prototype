package com.plateer.ec1.claim.creator;

import com.plateer.ec1.claim.model.ClaimModel;
import com.plateer.ec1.claim.vo.Claim;

public interface ClaimDataCreator {

    ClaimModel getInsertClaimData(Claim claim);

    ClaimModel getUpdateClaimData(Claim claim);

    void updateOrderBenefitData(ClaimModel claimModel);

    ClaimModel insertOrderBenefitRelation(ClaimModel claimModel);

    void updateOrderCost(ClaimModel claimModel);

    ClaimModel insertOrderCost(ClaimModel claimModel);

    void updateOrderClaim(ClaimModel claimModel);

    ClaimModel insertOrderClaim(ClaimModel claimModel);
}
