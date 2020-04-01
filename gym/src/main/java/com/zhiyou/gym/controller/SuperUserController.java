package com.zhiyou.gym.controller;

import com.zhiyou.gym.entity.ResponseCode;
import com.zhiyou.gym.entity.ResponseData;
import com.zhiyou.gym.mapper.SuperUserMapper;
import com.zhiyou.gym.pojo.SuperUser;
import com.zhiyou.gym.service.imp.SuperUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "superuser")
public class SuperUserController {

    @Autowired
    SuperUserMapper superUserMapper;
    @Autowired
    SuperUserServiceImpl superUserService;

    @RequestMapping("useraccount.do")
    public ResponseData FindAccount(SuperUser superUser, ResponseData responseData) {
    responseData =  superUserService.FindAccount(superUser);
        return responseData;
    }
    @GetMapping(value = "findall.do")
    public String findall(Model model){
        model.addAttribute("user",superUserMapper.selectList(null));
        return "查询成功";
    }
}
