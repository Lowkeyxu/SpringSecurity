/*
 * @(#) commonService.java 2018/1/19
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.common;

import com.xuwc.learn.models.Test.dao.UserDao;
import com.xuwc.learn.models.Test.vo.RoleVo;
import com.xuwc.learn.models.Test.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/** UserSecurityService
 * @author xuwc
 * @version 1.0
 * @since 2018/1/19
 */
@Service
public class UserSecurityService implements UserDetailsService {


    @Autowired(required = false)
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserVo user = userDao.getUser(username);

        if (user == null) {
            throw new UsernameNotFoundException("user not found");
        }

        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        //获取用户的角色信息
        List<RoleVo> roleList = user.getRoleList();
        //遍历插入角色
        for(RoleVo roleVo : roleList){
            authorities.add(new SimpleGrantedAuthority(roleVo.getName()));
        }

        return new org.springframework.security.core.userdetails.User(
                user.getUserName(),
                user.getPassword(),
                authorities);
    }
}
