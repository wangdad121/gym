package com.zhiyou.gym.controller;

import com.zhiyou.gym.pojo.perManage;
import com.zhiyou.gym.service.perManageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "perManage")
public class perManageController {
    @Autowired
    private com.zhiyou.gym.service.perManageService perManageService;
    //todo 查询假数据
    @RequestMapping(value = "selectAll")
    public List<perManage> m1(){
        return perManageService.selectAll();
    }
}
