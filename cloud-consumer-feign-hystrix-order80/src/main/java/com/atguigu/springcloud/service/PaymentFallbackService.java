package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component //必须加 //必须加 //必须加
public class PaymentFallbackService implements PaymentHystrixService
{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_Ok,o huo";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut,o huo";
    }
}

