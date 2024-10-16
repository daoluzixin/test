package com.example.Controller;

import com.example.Service.UserService;
import com.example.pojo.Result;
import com.example.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class registerController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        log.info("用户注册:()", user);
        User u = userService.register(user);

        return u;
    }
}
