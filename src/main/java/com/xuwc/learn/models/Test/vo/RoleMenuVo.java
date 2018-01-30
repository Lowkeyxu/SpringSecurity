/*
 * @(#) RoleMenuVo.java 2017/3/22 0022
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.Test.vo;


import com.xuwc.learn.common.base.entity.DbBaseVo;

/**
 *  角色菜单
 * @author xuwc
 * @version 1.0
 * @since 2017/3/22 0022
 */
public class RoleMenuVo extends DbBaseVo<RoleMenuVo> {
    //角色id
    private String role_id;
    //菜单id
    private String menu_id;

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(String menu_id) {
        this.menu_id = menu_id;
    }
}
