package com.plateer.ec1.claim.creator;

import com.plateer.ec1.claim.model.ClaimModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EcouponCancelCompleteDataCreator extends ClaimDataCreator{
    @Override
    public void updateOrderBenefitData(ClaimModel claimModel) {
        log.info("EcouponCancelCompleteDataCreator - updateOrderBenefitData");
    }

    @Override
    public ClaimModel insertOrderBenefitData(ClaimModel claimModel) {
        log.info("EcouponCancelCompleteDataCreator - insertOrderBenefitData");
        return null;
    }

    @Override
    public void updateOrderCost(ClaimModel claimModel) {
        log.info("EcouponCancelCompleteDataCreator - updateOrderCost");
    }

    @Override
    public ClaimModel insertOrderCost(ClaimModel claimModel) {
        log.info("EcouponCancelCompleteDataCreator - insertOrderCost");
        return null;
    }

    @Override
    public void updateOrderClaim(ClaimModel claimModel) {
        log.info("EcouponCancelCompleteDataCreator - updateOrderClaim");
    }

    @Override
    public ClaimModel insertOrderClaim(ClaimModel claimModel) {
        log.info("EcouponCancelCompleteDataCreator - insertOrderClaim");
        return null;
    }
}
