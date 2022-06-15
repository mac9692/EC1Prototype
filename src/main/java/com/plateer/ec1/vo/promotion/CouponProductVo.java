package com.plateer.ec1.vo.promotion;

import com.plateer.ec1.vo.Product;
import lombok.Data;

import java.util.List;

@Data
public class CouponProductVo {

    private Promotion promotion;
    private List<Product> productList;
    private String maxBenefitYn;

}
