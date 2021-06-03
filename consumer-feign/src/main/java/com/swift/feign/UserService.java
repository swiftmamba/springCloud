package com.swift.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient("PROVIDER-01")
public interface UserService {

    @RequestMapping(value = "/get/user/{swift}")
    public String sagHello(@PathVariable("swift") String hi);
}
