package com.plateer.ec1.claim.creator;

import com.plateer.ec1.claim.model.ClaimModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Primary
public class ECouponCancelAcceptDataCreator extends ClaimDataCreator {

    @Override
    public void updateOrderBenefitData(ClaimModel claimModel) {
        log.info("ECouponCancelAcceptDataCreator - updateOrderBenefitData");
    }

    @Override
    public ClaimModel insertOrderBenefitData(ClaimModel claimModel) {
        log.info("ECouponCancelAcceptDataCreator - insertOrderBenefitData");
        return null;
    }

    @Override
    public void updateOrderCost(ClaimModel claimModel) {
        log.info("ECouponCancelAcceptDataCreator - updateOrderCost");
    }

    @Override
    public ClaimModel insertOrderCost(ClaimModel claimModel) {
        log.info("ECouponCancelAcceptDataCreator - insertOrderCost");
        return null;
    }

    @Override
    public void updateOrderClaim(ClaimModel claimModel) {
        log.info("ECouponCancelAcceptDataCreator - updateOrderClaim");
    }

    @Override
    public ClaimModel insertOrderClaim(ClaimModel claimModel) {
        log.info("ECouponCancelAcceptDataCreator - insertOrderClaim");
        return null;
    }
}
