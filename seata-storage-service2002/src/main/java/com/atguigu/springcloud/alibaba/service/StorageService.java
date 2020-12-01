package com.atguigu.springcloud.alibaba.service;

/**
 * @Author LiuJing
 * @Date: 2020/10/30/ 10:37
 * @Description
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId,Integer count);
}
