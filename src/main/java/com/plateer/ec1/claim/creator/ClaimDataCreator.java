package com.plateer.ec1.claim.creator;

import com.plateer.ec1.claim.data.CreatorType;
import com.plateer.ec1.claim.model.ClaimModel;
import com.plateer.ec1.claim.vo.Claim;
import lombok.extern.slf4j.Slf4j;

public interface ClaimDataCreator {

    CreatorType getType();

    ClaimModel getInsertClaimData(Claim claim);

    ClaimModel getUpdateClaimData(Claim claim);

    void updateOrderBenefitData(Claim claim);

    ClaimModel insertOrderBenefitRelation(ClaimModel claimModel);

    void updateOrderCost(ClaimModel claimModel);

    ClaimModel insertOrderCost(ClaimModel claimModel);

    void updateOrderClaim(ClaimModel claimModel);

    ClaimModel insertOrderClaim(ClaimModel claimModel);
}
