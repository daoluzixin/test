package com.example.Service;

import com.example.pojo.User;

import java.util.List;

public interface UserService {

    /**
     * 用户注册
     * @Param user
     * @return
     */
    User register(User user);

    /**
     * 用户登录
     * @Param emp
     * @return
     */
    User login(User user);
}
