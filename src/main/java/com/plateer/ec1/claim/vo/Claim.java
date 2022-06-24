package com.plateer.ec1.claim.vo;

import com.plateer.ec1.claim.data.ClaimType;
import com.plateer.ec1.claim.data.CreatorType;
import com.plateer.ec1.claim.data.ProcessorType;
import lombok.Data;

import java.util.List;

@Data
public class Claim {

    private String claimNo;
    private CreatorType creatorType;
    private ProcessorType processorType;
    private List<ClaimItem> claimItemList;
}
