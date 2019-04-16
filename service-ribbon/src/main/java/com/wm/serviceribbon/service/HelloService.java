package com.wm.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "mircBroken")
    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-SERVICE-A/service?name="+name,String.class);
    }

    public String mircBroken(String name) {
        return "service:"+name+" -- system  exception occurred";
    }
}