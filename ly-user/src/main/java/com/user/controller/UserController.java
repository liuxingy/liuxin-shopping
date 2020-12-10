package com.user.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author liuxy
 * @version 1.0
 * @description:
 * @date 2020/12/7 16:23
 */

@RestController
@RequestMapping("consumer")
@DefaultProperties(defaultFallback = "fallBack")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand
    @GetMapping("user")
   public String queryId(long id) {
        if (id % 2 == 0) {
            throw new RuntimeException("");
        }
        String url = "http://item-service/consumer/user";
        String forObject = restTemplate.getForObject(url, String.class);
        return forObject;
   }

    public String fallBack() {
        return "不要意思，服务器太拥挤了";
    }
}
