package com.leyou.item.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liuxy
 * @version 1.0
 * @description:
 * @date 2020/12/7 16:23
 */

@RestController
@RequestMapping("consumer")
public class UserController {
    @GetMapping("user")
   public Map queryId() {
        Map<String, Object> map = new HashMap<>();
        map.put("username", "张三");
        map.put("password", "123");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return map;
   }
}
