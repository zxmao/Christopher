package com.christopher.spring.cloud.web.admin.feign.service;

import org.springframework.stereotype.Component;

/**
 * @author Christopher
 * @since 2020/12/7 上午3:24
 */
@Component
public class AdminServiceHystrix implements AdminService{

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
