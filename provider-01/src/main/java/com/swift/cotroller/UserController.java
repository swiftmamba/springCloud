package com.swift.cotroller;

import com.swift.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author swift
 * @version 1.0
 * @description: TODO
 * @date 2021/5/31 14:07
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/get/user/{swift}")
    public String sagHello(@PathVariable("swift") String hi) {
        return userService.sagHello(hi);
    }
}
