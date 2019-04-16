package com.wm.servicefeign.service.impl;

import com.wm.servicefeign.service.SchedualServiceA;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceAHystric implements SchedualServiceA {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}