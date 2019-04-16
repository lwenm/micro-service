package com.wm.servicefeign.service;

import com.wm.servicefeign.service.impl.SchedualServiceAHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-service-a",fallback = SchedualServiceAHystric.class)
public interface SchedualServiceA {
    @RequestMapping(value = "/service",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}