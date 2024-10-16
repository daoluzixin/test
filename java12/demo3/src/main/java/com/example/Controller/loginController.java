package com.example.Controller;

import com.example.Service.UserService;
import com.example.pojo.Result;
import com.example.pojo.User;
import com.example.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


    @Slf4j
    @RestController
    public class loginController {

        @Autowired
        private UserService userService;

        @PostMapping("/login")
        public Result login(@RequestBody User user) {
            log.info("用户登录:()", user);
            User e = userService.login(user);

            //登陆成功,生成令牌并下发
            if (e != null){
                Map<String, Object> claims = new HashMap<>();
                claims.put("username", e.getUsername());

                String jwt = JwtUtils.genrateJwt(claims);//jwt包含了当前登录的员工信息
                System.out.println("token");
                return Result.success(jwt);
            }
            //登录失败,返回错误信息
            return e != null?Result.success():Result.error("用户名或密码错误!");
        }
    }



