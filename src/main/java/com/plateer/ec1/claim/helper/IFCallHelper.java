package com.plateer.ec1.claim.helper;

import com.plateer.ec1.claim.vo.Claim;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class IFCallHelper {

    public void callRestoreCoupon(Claim claim) {
        log.info("IFCallHelper - callRestoreCoupon");
    }

    public void callPaymentIF(Claim claim) {
        log.info("IFCallHelper - callPaymentIF");
    }
}
