package com.plateer.ec1.claim.creator;

import com.plateer.ec1.claim.model.ClaimModel;
import org.springframework.stereotype.Component;

@Component
public class ExchangeAcceptDataCreator extends ClaimDataCreator{
    @Override
    public void updateOrderBenefitData(ClaimModel claimModel) {

    }

    @Override
    public ClaimModel insertOrderBenefitData(ClaimModel claimModel) {
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
