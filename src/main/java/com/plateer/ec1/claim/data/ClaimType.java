package com.plateer.ec1.claim.data;

public enum ClaimType {
    GCC("completeProcessor", "generalOrderCancelDataCreator"),
    MCA("acceptWithdrawalProcessor", "ecouponCancelCompleteDataCreator"),
    MCC("completeProcessor","generalOrderCancelDataCreator"),
    RA("completeProcessor", "generalOrderCancelDataCreator"),
    RC("completeProcessor", "generalOrderCancelDataCreator"),
    RW("completeProcessor", "generalOrderCancelDataCreator"),
    EA("completeProcessor", "generalOrderCancelDataCreator"),
    EW("completeProcessor", "generalOrderCancelDataCreator"),
    ;

    private String claimProcessorType;
    private String claimDataCreatorType;

    ClaimType(String claimProcessorType, String claimDataCreatorType) {
        this.claimProcessorType = claimProcessorType;
        this.claimDataCreatorType = claimDataCreatorType;
    }

    public String getClaimProcessorType() {
        return claimProcessorType;
    }

    public String getClaimDataCreatorType() {
        return claimDataCreatorType;
    }

}
