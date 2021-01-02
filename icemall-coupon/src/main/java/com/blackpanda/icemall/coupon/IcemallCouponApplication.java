package com.blackpanda.icemall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author BlackPanda
 * @date 2020/12/25
 */
@EnableDiscoveryClient
@SpringBootApplication
public class IcemallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(IcemallCouponApplication.class, args);
    }
}
