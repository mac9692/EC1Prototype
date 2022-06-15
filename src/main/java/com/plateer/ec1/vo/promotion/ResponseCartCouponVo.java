package com.plateer.ec1.vo.promotion;

import lombok.Data;

import java.util.List;

@Data
public class ResponseCartCouponVo extends ResponseBaseVo {

    private String memberNo;
    private List<String> promotionProductList;
}
