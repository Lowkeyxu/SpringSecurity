/*
 * @(#) UserDao.java 2017/12/7
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.Test.dao;

import com.xuwc.learn.models.Test.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/** 用户Dao
 * @author xuwc
 * @version 1.0
 * @since 2017/12/7
 */
@Mapper
public interface UserDao {
    //获取用户信息
    UserVo getUser(String loginName);
}
