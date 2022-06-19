package com.plateer.ec1.claim.creator;

import com.plateer.ec1.claim.model.ClaimModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class GeneralOrderCancelDataCreator extends ClaimDataCreator{
    @Override
    public void updateOrderBenefitData(ClaimModel claimModel) {
        log.info("GeneralOrderCancelDataCreator - updateOrderBenefitData");
    }

    @Override
    public ClaimModel insertOrderBenefitData(ClaimModel claimModel) {
        log.info("GeneralOrderCancelDataCreator - insertOrderBenefitData");

        return null;
    }

    @Override
    public void updateOrderCost(ClaimModel claimModel) {
        log.info("GeneralOrderCancelDataCreator - updateOrderCost");

    }

    @Override
    public ClaimModel insertOrderCost(ClaimModel claimModel) {
        log.info("GeneralOrderCancelDataCreator - insertOrderCost");
        return null;
    }

    @Override
    public void updateOrderClaim(ClaimModel claimModel) {
        log.info("GeneralOrderCancelDataCreator - updateOrderClaim");
    }

    @Override
    public ClaimModel insertOrderClaim(ClaimModel claimModel) {
        log.info("GeneralOrderCancelDataCreator - insertOrderClaim");
        return null;
    }
}
