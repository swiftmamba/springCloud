package com.swift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEureka8762Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringEureka8762Application.class, args);
    }

}
