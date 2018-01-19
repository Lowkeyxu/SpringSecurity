/*
 * @(#) UserVo.java 2017/12/7
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.Test.vo;


import com.xuwc.learn.common.base.entity.BaseEntity;

/** 用户vo
 * @author xuwc
 * @version 1.0
 * @since 2017/12/7
 */
public class UserVo extends BaseEntity{
    private String id;
    private String loginName;
    private String userName;
    private String sex;
    private String photoImage;
    private String password;
    private String delFlag;
    private String addTime;
    private String addUserId;
    private String addMark;
    private String updTime;
    private String updUserId;
    private String updMark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId;
    }

    public String getAddMark() {
        return addMark;
    }

    public void setAddMark(String addMark) {
        this.addMark = addMark;
    }

    public String getUpdTime() {
        return updTime;
    }

    public void setUpdTime(String updTime) {
        this.updTime = updTime;
    }

    public String getUpdUserId() {
        return updUserId;
    }

    public void setUpdUserId(String updUserId) {
        this.updUserId = updUserId;
    }

    public String getUpdMark() {
        return updMark;
    }

    public void setUpdMark(String updMark) {
        this.updMark = updMark;
    }
}
