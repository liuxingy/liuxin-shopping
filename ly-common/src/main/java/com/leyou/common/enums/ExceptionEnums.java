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
    PRICE_CANNOT_BE_NO_NULL("价格不能为空", 400)
    ;
    private String msg;
    private int code;

}
