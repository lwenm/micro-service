package com.wm.eurekaclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
     * 配置viewController,为页面提供路径映射
     */
    @Controller
    public class WebMvcConfig extends WebMvcConfigurerAdapter {

        /**
         * 配置viewController,提供映射路径
         */
        @Override
        public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/webSocket").setViewName("/webSocket");
        }
    }

