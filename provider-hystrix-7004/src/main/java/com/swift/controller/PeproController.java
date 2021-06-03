package com.swift.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author swift
 * @version 1.0
 * @description: TODO
 * @date 2021/6/1 17:06
 */
@RestController
public class PeproController {

    @RequestMapping("/get/pepro/{name}")
    @HystrixCommand(fallbackMethod = "getPeproByNameFail")
    public String getPeproByName(@PathVariable("name") String name) {
        if ("sweet".equals(name)) {
            throw new RuntimeException("没有" + name);
        }
        String result = "What's yuor name :" + name;
        return result;
    }

    /**
     * 服务降级方法
     *
     * @param name
     * @return
     */
    public String getPeproByNameFail(@PathVariable("name") String name) {
        String result = "服务降级: " + name;
        System.out.println(result);
        return result;
    }

}
