package com.swift.service.impl;

import com.swift.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author swift
 * @version 1.0
 * @description: TODO
 * @date 2021/5/31 14:04
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String sagHello(String hi) {
        return "这是提供者7001";
    }
}
