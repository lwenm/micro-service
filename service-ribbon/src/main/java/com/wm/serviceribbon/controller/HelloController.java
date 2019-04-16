package com.wm.serviceribbon.controller;

import com.wm.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/use-service")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name+"---------ribbon-----------");
    }
}