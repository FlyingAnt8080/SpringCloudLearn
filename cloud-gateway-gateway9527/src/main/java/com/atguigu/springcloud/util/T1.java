package com.atguigu.springcloud.util;

import java.time.ZonedDateTime;

/**
 * @Author LiuJing
 * @Date: 2020/10/24/ 23:23
 * @Description
 */
public class T1 {
    public static void main(String[] args) {
        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println(zdt);
        //2020-10-24T23:25:06.746+08:00[Asia/Shanghai]
    }
}
