/*
 * @(#) IndexAction.java 2018/1/19
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.Test.controller;

import com.xuwc.learn.models.Test.vo.UserVo;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/** 首页Action
 * @author xuwc
 * @version 1.0
 * @since 2018/1/19
 */
@Controller
public class IndexAction {

    //首页
    @RequestMapping("index")
    public String index(){
        return "frame";
    }


    //admin 权限页面
    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("admin")
    public String admin(ModelMap map){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String userName = "";
        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        } else {
            userName = principal.toString();
        }
        map.put("userName",userName);
        return "index";
    }
}
