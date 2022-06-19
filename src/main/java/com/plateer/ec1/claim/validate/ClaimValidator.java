package com.plateer.ec1.claim.validate;

import com.plateer.ec1.claim.vo.Claim;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ClaimValidator {

    public void isValidStatus(Claim claim) {
        log.info("ClaimValidator - isValidStatus");
    }

    public void isValidAmount(Claim claim) {
        log.info("ClaimValidator - isValidAmount");
    }

    public void verifyAmount(Claim claim) {
        log.info("ClaimValidator - verifyAmount");
    }
}
