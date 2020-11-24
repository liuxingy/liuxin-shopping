package com.leyou.item.web;

import com.leyou.item.pojo.Item;
import com.leyou.item.service.ItemService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxy
 * @version 1.0
 * @description:
 * @date 2020/11/24 15:55
 */
@RestController
@Controller("item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping
    public ResponseEntity<Item> saveItem(Item item) {

        if (item.getPrice() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
         return ResponseEntity.status(HttpStatus.CREATED).body(itemService.saveItem(item));

    }
}
