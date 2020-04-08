package com.zhiyou.gym.controller;

import com.zhiyou.gym.pojo.GymCabInfo;
import com.zhiyou.gym.service.GymCabInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value ="GymCabInfo")
public class GymCabInfoController {
    @Autowired
    private GymCabInfoService gymCabInfoService;
    //添加租柜
    @RequestMapping(value = "insert")
    public void m1(GymCabInfo gymCabInfo){
        gymCabInfoService.insertGymCabInfo(gymCabInfo);
    }
    //删除租柜
    @RequestMapping(value = "delete")
    public  void m2(Integer id){
        gymCabInfoService.deleteGymCabInfo(id);
    }
    //查询租柜
    @RequestMapping(value = "select")
    public List<GymCabInfo> m2(){
        return gymCabInfoService.selectAll();
    }

}
