package com.plateer.ec1.claim;

import com.plateer.ec1.claim.controller.ClaimController;
import com.plateer.ec1.claim.data.ClaimType;
import com.plateer.ec1.claim.vo.Claim;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
@TestMethodOrder(value = MethodOrderer.DisplayName.class)
public class ClaimTest {

    @Autowired
    ClaimController claimController;

    @Test
    @DisplayName("1. GCC 테스트")
    void gccTest() {
        log.info("1. GCC 테스트 시작");
        Claim claim = new Claim();
        claim.setClaimType(ClaimType.GCC);
        claimController.claim(claim);
        log.info("1. GCC 테스트 종료");
    }

    @Test
    @DisplayName("2. MCA 테스트")
    void mcaTest() {
        log.info("2. MCA 테스트 시작");
        Claim claim = new Claim();
        claim.setClaimType(ClaimType.MCA);
        claimController.claim(claim);
        log.info("2. MCA 테스트 종료");
    }
}
