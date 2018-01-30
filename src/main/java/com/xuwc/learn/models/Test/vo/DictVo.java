/*
 * @(#) DictVo.java 2017/3/21 0021
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.Test.vo;

import com.xuwc.learn.common.base.entity.DbBaseVo;

/**
 * 数据字典Vo
 * @author xuwc
 * @version 1.0
 * @since 2017/3/21 0021
 */
public class DictVo extends DbBaseVo<DictVo> {
    private String value;//数据值
    private String label;//标签名
    private String type;//类型
    private String description;//描述
    private int sort;//排序（升序）

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }
}
