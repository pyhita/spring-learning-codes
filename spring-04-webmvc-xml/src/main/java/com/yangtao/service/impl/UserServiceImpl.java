package com.yangtao.service.impl;

import com.yangtao.entity.User;
import com.yangtao.mapper.UserMapper;
import com.yangtao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listUsers() {

        return userMapper.getUsers();
    }
}
