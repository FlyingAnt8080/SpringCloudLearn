package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author LiuJing
 * @Date: 2020/10/14/ 16:19
 * @Description
 */
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}
