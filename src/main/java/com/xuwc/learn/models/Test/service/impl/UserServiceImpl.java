/*
 * @(#) UserServiceImpl.java 2017/12/7
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.Test.service.impl;

import com.xuwc.learn.models.Test.dao.UserDao;
import com.xuwc.learn.models.Test.service.UserService;
import com.xuwc.learn.models.Test.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** 用户service实现
 * @author xuwc
 * @version 1.0
 * @since 2017/12/7
 */
@Service
public class UserServiceImpl implements UserService{

    //用户dao
    @Autowired(required = false)
    private UserDao userDao;

    /**
     * 获取用户数据
     * @param loginName
     * @return
     */
    @Override
    public UserVo getUser(String loginName) {
        return userDao.getUser(loginName);
    }
}
