package com.leyou.item.service;

import com.leyou.common.enums.ExceptionEnums;
import com.leyou.common.exception.LyException;
import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuxy
 * @version 1.0
 * @description:
 * @date 2020/12/1 13:46
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> queryCategoryListById(long pid) {
        Category category = new Category();
        category.setParentId(pid);
        List<Category> select = categoryMapper.select(category);
        if (select == null || select.isEmpty()) {
            throw new LyException(ExceptionEnums.CATEGORY_NOT_FOND);
        }
        return select;


    }
}
