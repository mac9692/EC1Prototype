package com.plateer.ec1.claim.serviceImpl;

import com.plateer.ec1.claim.factory.ClaimProcessorFactory;
import com.plateer.ec1.claim.processor.ClaimProcessor;
import com.plateer.ec1.claim.service.ClaimService;
import com.plateer.ec1.claim.vo.Claim;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClaimServiceImpl implements ClaimService {

    private final ClaimProcessorFactory claimFactory;
    @Override
    public void claim(Claim claim) {
        log.info("ClaimServiceImpl - claim");
        ClaimProcessor claimProcessor = claimFactory.getClaimProcessor(claim.getClaimType().getClaimProcessorType());
        claimProcessor.doProcess(claim);
    }
}
