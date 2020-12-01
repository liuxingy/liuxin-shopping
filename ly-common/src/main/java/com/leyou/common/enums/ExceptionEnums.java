package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author liuxy
 * @version 1.0
 * @description:
 * @date 2020/11/25 10:15
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ExceptionEnums {
    PRICE_CANNOT_BE_NO_NULL(400,"价格不能为空"),
    CATEGORY_NOT_FOND(404, "商品分类没有查询到")
    ;
    private int code;
    private String msg;

}
