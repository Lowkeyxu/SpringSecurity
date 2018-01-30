/*
 * @(#) MenuVo.java 2017/3/16 0016
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.Test.vo;


import com.xuwc.learn.common.base.entity.DbBaseVo;

/** 菜单vo
 * @author xuwc
 * @version 1.0
 * @since 2017/3/16 0016
 */
public class MenuVo extends DbBaseVo<MenuVo> {
    private String permission;
    private String parent_id;
    private String parent_ids;
    private String name;
    private String type;
    private String href;
    private String icon;
    private String show_flag;
    private String target;
    private String sort;
    private String remark;

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getParent_ids() {
        return parent_ids;
    }

    public void setParent_ids(String parent_ids) {
        this.parent_ids = parent_ids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getShow_flag() {
        return show_flag;
    }

    public void setShow_flag(String show_flag) {
        this.show_flag = show_flag;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
