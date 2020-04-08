package com.zhiyou.gym.controller;

import com.zhiyou.gym.pojo.UserInto;
import com.zhiyou.gym.service.UserIntoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "userinto")
public class UserIntoController {
    @Autowired
    private UserIntoService userIntoService;
    //会员进场
    @RequestMapping(value = "insert")
    public void  m1(UserInto userInto){
        //TODO 会员表没写
        userIntoService.insertUserInto(userInto);
    }
    //会员离场
    @RequestMapping(value = "update")
    public  void m2(UserInto userInto){
        userIntoService.updateUserInto(userInto);
    }
}
