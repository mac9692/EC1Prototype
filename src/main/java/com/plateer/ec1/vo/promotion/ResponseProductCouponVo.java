package com.plateer.ec1.vo.promotion;

import lombok.Data;

import java.util.List;

@Data
public class ResponseProductCouponVo extends ResponseBaseVo {

    private String memberNo;
    private List<ProductCouponVo> productPromotionList;
}
