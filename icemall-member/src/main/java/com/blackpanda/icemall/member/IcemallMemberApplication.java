package com.blackpanda.icemall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.blackpanda.icemall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class IcemallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(IcemallMemberApplication.class, args);
    }

}
