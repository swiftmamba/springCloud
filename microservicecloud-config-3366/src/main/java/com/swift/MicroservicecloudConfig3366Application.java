package com.swift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicecloudConfig3366Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConfig3366Application.class, args);
    }

}
