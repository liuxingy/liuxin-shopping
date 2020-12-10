package com.user.client;

import com.user.entity.Login;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author liuxy
 * @version 1.0
 * @description:
 * @date 2020/12/10 11:07
 */

@FeignClient("item-service")
public interface UserClient {

    @GetMapping("user")
    Login queryById();
}
