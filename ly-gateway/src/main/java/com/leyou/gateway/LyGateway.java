package com.leyou.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * @author liuxy
 * @version 1.0
 * @description:
 * @date 2020/11/20 19:44
 */
@SpringCloudApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class LyGateway {
    public static void main(String[] args) {
        SpringApplication.run(LyGateway.class);
    }
}
