package com.glun.springbootvalidation.web.controller;

import com.glun.springbootvalidation.domain.User;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @PostMapping("/user/save")
    public User save(@Valid @RequestBody User user) {
       return  user;
    }

    @PostMapping("/user/save2")
    public User save2(@RequestBody User user) {

        //Api Assert调用方式
        Assert.hasText(user.getName(),"姓名不能为空");

        //java 或者 jvm断言
        assert user.getId()<=100000;
        return  user;
    }
}
