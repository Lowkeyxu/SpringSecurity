/*
 * @(#) OauthAction.java 2018/1/18
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.Oauth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuwc
 * @version 1.0
 * @since 2018/1/18
 */
@RestController
@RequestMapping("/oauth")
public class OauthAction {

    //回调
    @RequestMapping("")
    public String index(String code,String state){
        return "code: "+code +" state:"+ state;
    }
}
