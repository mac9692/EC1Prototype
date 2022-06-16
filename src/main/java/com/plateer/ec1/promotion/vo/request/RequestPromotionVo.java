package com.plateer.ec1.promotion.vo.request;

import com.plateer.ec1.product.vo.Product;
import lombok.Data;

import java.util.List;

@Data
public class RequestPromotionVo {

    private String memberNo;
    private List<Product> productList;
    private Long couponIssueNo;
}
