package com.swift.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author swift
 * @version 1.0
 * @description: TODO
 * @date 2021/5/31 15:28
 */
@RestController
public class UserController {

    @Autowired
   private RestTemplate restTemplate;

    @RequestMapping("/show/{swift}")
    public String sagHello(@PathVariable("swift") String hi) {
//       restTemplate.getForObject("http://localhost:7001/get/user" + hi, String.class);
        String string = restTemplate.getForObject("(http://SERVER-01/" + hi, String.class);
        System.out.println("string = " + string);
        return string;

    }


}
