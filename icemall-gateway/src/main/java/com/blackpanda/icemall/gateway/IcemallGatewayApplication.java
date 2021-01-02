package com.blackpanda.icemall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、开启服务注册发现
 * （配置Nacos配置中心地址）
 */
@EnableDiscoveryClient
@SpringBootApplication
public class IcemallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(IcemallGatewayApplication.class, args);
    }

}
