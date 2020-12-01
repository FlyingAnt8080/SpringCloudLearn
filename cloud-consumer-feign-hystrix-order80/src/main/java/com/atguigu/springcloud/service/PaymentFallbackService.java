package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @Author LiuJing
 * @Date: 2020/10/24/ 11:04
 * @Description
 */
@Service
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "---back-paymentInfo_OK：对方服务器已经宕机了，请稍后再试！";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "back-paymentInfo_TimeOut：对方服务器已经宕机了，请稍后再试！";
    }
}
