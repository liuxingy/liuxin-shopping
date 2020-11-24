package com.leyou.item.service;

import com.leyou.item.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author liuxy
 * @version 1.0
 * @description:
 * @date 2020/11/24 15:52
 */
@Service
public class ItemService {
    public Item saveItem(Item item) {
        int id = new Random().nextInt(100);
        item.setId(id);
        return item;
    }
}
