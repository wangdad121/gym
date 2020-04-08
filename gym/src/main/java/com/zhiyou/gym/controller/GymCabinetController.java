package com.zhiyou.gym.controller;

import com.zhiyou.gym.pojo.gymCabinet;
import com.zhiyou.gym.service.GymCabinetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "gymCabinet")
public class GymCabinetController {
    @Autowired
    private GymCabinetService gymCabinetService;
    //查询所有租柜
    @GetMapping(value = "gyms")
    public List<gymCabinet> m1(){
        return gymCabinetService.selectAll();
    }
    //查询所有空闲租柜
    @GetMapping(value = "gymsk")
    public List<gymCabinet> m2(){
        return gymCabinetService.selectAllByStatic();
    }
    //添加租柜
    @RequestMapping("add")
    public void m2(gymCabinet gymCabinet){
        gymCabinetService.inserGymCabinet(gymCabinet);
    }
    //删除租柜
    @RequestMapping("delete")
    public void m3(Integer id){
        gymCabinetService.deleteGymCabinet(id);
    }

}
