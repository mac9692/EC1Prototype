package com.plateer.ec1.vo.promotion;

import com.plateer.ec1.vo.Product;
import lombok.Data;

import java.util.List;

@Data
public class ProductCouponVo {

    private Product product;
    private List<Promotion> promotionList;
    private String maxBenefitYn;
}
