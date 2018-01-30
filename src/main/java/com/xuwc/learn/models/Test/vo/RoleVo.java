/*
 * @(#) RoleVo.java 2017/3/22 0022
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.Test.vo;

import com.xuwc.learn.common.base.entity.DbBaseVo;

/**
 *  角色vo
 * @author xuwc
 * @version 1.0
 * @since 2017/3/22 0022
 */
public class RoleVo extends DbBaseVo<RoleVo> {
    //map 集合用
    private String roleId;
    //角色名称
    private String name;
    //备注
    private String remark;
    //状态（0：禁用，1：启用）
    private String state;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
