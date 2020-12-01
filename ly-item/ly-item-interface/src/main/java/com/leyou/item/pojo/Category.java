package com.leyou.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author liuxy
 * @version 1.0
 * @description:
 * @date 2020/11/30 15:33
 */
@Table(name="tb_category")
@Data
public class Category {
    @Id
    @KeySql(useGeneratedKeys=true)
    private Long id;
    private String name;
    private Long parentId;
    private Boolean isParent;
    private Integer sort;
    // getter和setter略
    // 注意isParent的get和set方法

}
