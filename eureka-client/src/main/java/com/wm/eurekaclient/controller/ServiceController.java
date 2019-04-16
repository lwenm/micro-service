package com.wm.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:lwenm
 * Description:
 * Date:2019/4/16
 * Time:21:55
 **/
@RestController
public class ServiceController {


    @Value("${server.port}")
    String port;

    @RequestMapping("/service")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "service from port:" + port  +"      name= "+name;
    }
}
