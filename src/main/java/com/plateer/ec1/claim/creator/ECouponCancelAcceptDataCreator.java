package com.plateer.ec1.claim.creator;

import com.plateer.ec1.claim.data.CreatorType;
import com.plateer.ec1.claim.model.ClaimModel;
import com.plateer.ec1.claim.vo.Claim;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ECouponCancelAcceptDataCreator implements ClaimDataCreator{
    @Override
    public CreatorType getType() {
        return CreatorType.ECOUPONCANCELACCEPT;
    }

    @Override
    public ClaimModel getInsertClaimData(Claim claim) {
        return null;
    }

    @Override
    public ClaimModel getUpdateClaimData(Claim claim) {
        return null;
    }

    @Override
    public void updateOrderBenefitData(Claim claim) {

    }

    @Override
    public ClaimModel insertOrderBenefitRelation(ClaimModel claimModel) {
        return null;
    }

    @Override
    public void updateOrderCost(ClaimModel claimModel) {

    }

    @Override
    public ClaimModel insertOrderCost(ClaimModel claimModel) {
        return null;
    }

    @Override
    public void updateOrderClaim(ClaimModel claimModel) {

    }

    @Override
    public ClaimModel insertOrderClaim(ClaimModel claimModel) {
        return null;
    }

}
