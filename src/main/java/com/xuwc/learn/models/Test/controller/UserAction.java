/*
 * @(#) UserAction.java 2017/12/7
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.Test.controller;

import com.xuwc.learn.models.Test.service.UserService;
import com.xuwc.learn.models.Test.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/** 用户Action
 * @author xuwc
 * @version 1.0
 * @since 2017/12/7
 */
@Controller
@RequestMapping("/m")
public class UserAction {

    //用户service
    @Autowired
    private UserService userService;

    /**
     * 获取用户信息
     * @return
     */
    @RequestMapping("/info")
    public String index(String loginName,ModelMap map){
        UserVo userVo = userService.getUser(loginName);
        map.put("user",userVo);
        return "frame";
    }
}
