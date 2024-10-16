package com.example.Service.Impl;

import com.example.Mapper.UserMapper;
import com.example.Service.UserService;
import com.example.pojo.Result;
import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class userServiceImpl implements UserService {

        @Autowired
        private UserMapper userMapper;

        @Override
        public User register(User user) {
            User u = userMapper.insert(user);
            return u;
        }

        @Override
        public User login(User user) {
            User u = userMapper.getByUsernameAndPassword(user);
            return u;
        }
    }


