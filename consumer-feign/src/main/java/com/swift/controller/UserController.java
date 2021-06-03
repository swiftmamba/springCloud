package com.swift.controller;

import com.swift.feign.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author swift
 * @version 1.0
 * @description: TODO
 * @date 2021/6/1 15:44
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/get/user/{swift}")
    public String sagHello(@PathVariable("swift") String hi) {
        return userService.sagHello(hi);

    }


}
