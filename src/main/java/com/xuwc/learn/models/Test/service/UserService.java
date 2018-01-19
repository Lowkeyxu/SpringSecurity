/*
 * @(#) UserService.java 2017/12/7
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.Test.service;

import com.xuwc.learn.models.Test.vo.UserVo;

/** 用户service
 * @author xuwc
 * @version 1.0
 * @since 2017/12/7
 */
public interface UserService {
    //获取用户信息
    UserVo getUser(String loginName);
}
