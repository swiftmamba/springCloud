package com.swift.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {
   @Value("${server.port}")
   private String serverPort;
   @Value("${spring.application.name}")
   private String springAppName;

   @RequestMapping("/show")
   public String show() {
      return "show方法[" + serverPort + "] " + springAppName;
   }
}