/*
 * @(#) UserRoleVo.java 2017/3/22 0022
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.Test.vo;

import com.xuwc.learn.common.base.entity.DbBaseVo;

/**
 * 用户角色vo
 * @author xuwc
 * @version 1.0
 * @since 2017/3/22 0022
 */
public class UserRoleVo extends DbBaseVo<UserRoleVo> {
    private String userId;//用户id
    private String role_id;//角色id

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }
}
