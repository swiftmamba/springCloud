package com.swift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


/**
 * @EnableCircuitBreaker 启用服务降级
 * @EnableHystrix 启用hystrix
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableHystrix
public class ProviderHystrix7004Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderHystrix7004Application.class, args);
    }

}
