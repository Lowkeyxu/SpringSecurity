/*
 * @(#) UserVo.java 2017/12/7
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.Test.vo;


import com.xuwc.learn.common.base.entity.DbBaseVo;

import java.util.ArrayList;
import java.util.List;

/** 用户vo
 * @author xuwc
 * @version 1.0
 * @since 2017/12/7
 */
public class UserVo extends DbBaseVo<UserVo> {
    //登录名称
    private String loginName;
    //用户名称
    private String userName;
    //性别
    private String sex;
    //用户头像
    private String photoImage;
    //密码
    private String password;
    //用户角色集合
    private List<RoleVo> roleList = new ArrayList<RoleVo>();
    //用户角色菜单
    private List<RoleMenuVo> roleMenuList = new ArrayList<RoleMenuVo>();
    //用户菜单集合
    private List<MenuVo> menuList = new ArrayList<MenuVo>();


    public List<RoleVo> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<RoleVo> roleList) {
        this.roleList = roleList;
    }

    public List<RoleMenuVo> getRoleMenuList() {
        return roleMenuList;
    }

    public void setRoleMenuList(List<RoleMenuVo> roleMenuList) {
        this.roleMenuList = roleMenuList;
    }

    public List<MenuVo> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<MenuVo> menuList) {
        this.menuList = menuList;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhotoImage() {
        return photoImage;
    }

    public void setPhotoImage(String photoImage) {
        this.photoImage = photoImage;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
