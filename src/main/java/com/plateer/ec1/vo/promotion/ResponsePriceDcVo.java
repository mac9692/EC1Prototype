package com.plateer.ec1.vo.promotion;

import com.plateer.ec1.vo.Product;
import lombok.Data;

import java.util.List;

@Data
public class ResponsePriceDcVo extends ResponseBaseVo {

    private String memberNo;
    private List<Product> productList;
}
