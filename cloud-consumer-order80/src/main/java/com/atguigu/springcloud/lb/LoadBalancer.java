package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import java.util.List;
/**
 * @Author LiuJing
 * @Date: 2020/10/17/ 17:17
 * @Description
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
