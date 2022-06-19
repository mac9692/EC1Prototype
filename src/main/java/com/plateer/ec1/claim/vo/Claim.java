package com.plateer.ec1.claim.vo;

import com.plateer.ec1.claim.data.ClaimType;
import lombok.Data;

import java.util.List;

@Data
public class Claim {

    private String claimNo;
    private ClaimType claimType;
    private List<ClaimItem> claimItemList;
}
