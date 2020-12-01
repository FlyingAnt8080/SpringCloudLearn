package com.atguigu.springcloud.alibaba.service;


import java.math.BigDecimal;
/**
 * @Author LiuJing
 * @Date: 2020/10/30/ 11:05
 * @Description
 */
public interface AccountService {
    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(Long userId,BigDecimal money);
}
