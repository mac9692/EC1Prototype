package com.plateer.ec1.order.data;

public enum SystemType {
    FO("foAfterStrategy"),
    BO("boAfterStrategy");

    private String systemType;

    SystemType(String systemType) {
        this.systemType = systemType;
    }

    public String getSystemType() {
        return systemType;
    }
}
