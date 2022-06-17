package com.plateer.ec1.payment.vo;


import com.plateer.ec1.payment.data.PaymentType;
import lombok.Data;

@Data
public class CancelRequestVo {

    private PaymentType paymentType;
}
