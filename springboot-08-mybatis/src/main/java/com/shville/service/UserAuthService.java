package com.shville.service;

import com.shville.entity.UserData;
import com.shville.mapper.MainMapper;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


import javax.annotation.Resource;

@Service
public class UserAuthService implements UserDetailsService {
    @Resource
    MainMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserData data = mapper.getUserByName(username);
        if (data == null) throw new UsernameNotFoundException("用户 " + username + " 登录失败，用户名不存在！");

        return User
                .withUsername(data.getUsername())
                .password(data.getUsername())
//                .roles(data.getRole())
                .build();
    }
}
