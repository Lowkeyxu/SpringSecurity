/*
 * @(#) WebSecurityConfig.java 2018/1/18
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.common.config;

import com.xuwc.learn.models.common.UserSecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

/** Security权限
 * @author xuwc
 * @version 1.0
 * @since 2018/1/18
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    private UserSecurityService userSecurityService;

    @Override
    protected UserDetailsService userDetailsService() {
        return userSecurityService;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
            http
                .authorizeRequests()
                    .antMatchers("/", "/home").permitAll()
                    .antMatchers("/admin/**").hasRole("ADMIN")  //admin 角色才能访问
                    .antMatchers("/xwc/**").access("hasRole('ADMIN') and hasRole('XWC')")  // 同时拥有admin和xwc的角色才能访问
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginPage("/login")
                    .permitAll()
                    .and()
                .logout()
                    .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService());
//            auth
//                .inMemoryAuthentication()
//                .withUser("xwc")
//                .password("xwc123")
//                .roles("USER");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userSecurityService).passwordEncoder(new PasswordEncoder() {

            @Override
            public String encode(CharSequence rawPassword) {
                return (String)rawPassword;//MD5Util.encode((String) rawPassword);
            }

            @Override
            public boolean matches(CharSequence rawPassword, String encodedPassword) {
                System.err.println(encodedPassword + "---" + (String)rawPassword);
                return encodedPassword.equals((String) rawPassword);
            }
        });
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
            web
                .ignoring()
                .antMatchers("/static/**");
    }
}
