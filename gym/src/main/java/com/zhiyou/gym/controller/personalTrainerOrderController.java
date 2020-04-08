package com.zhiyou.gym.controller;

import com.zhiyou.gym.pojo.User;
import com.zhiyou.gym.pojo.personalTrainerOrder;
import com.zhiyou.gym.service.personalTrainerOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("personalTrainerOrder")
public class personalTrainerOrderController {
    @Autowired
    private com.zhiyou.gym.service.personalTrainerOrderService personalTrainerOrderService;
    //(废弃)通过教练id添加会员（修改）
    @RequestMapping(value = "updateBypid")
    public void mm8(personalTrainerOrder personalTrainerOrder){
        System.out.println(personalTrainerOrder);
        personalTrainerOrderService.updateBypId(personalTrainerOrder);
    }
    //添加时段
    @RequestMapping(value = "insertshiduan")
    public void m1(personalTrainerOrder personalTrainerOrder){
        personalTrainerOrderService.insertpersonalTrainerOrder(personalTrainerOrder);
    }
    //通过会员id查询我的私教
    @RequestMapping("selectByUserId")
    public List<personalTrainerOrder> m2(Integer id){
        return  personalTrainerOrderService.selectPByUserId(id);
    }
    //通过教练id查询我的学员
    @RequestMapping(value = "selectByPerOrderId")
    public List<User> m3(Integer id){
        return  personalTrainerOrderService.selectAllUByperorderId(id);
    }
    //通过教练id查询表
    @RequestMapping(value = "selectById")
    public List<personalTrainerOrder> m4(Integer id){
        return  personalTrainerOrderService.slectById(id);
    }
    //通过表id查询单条数据
    @RequestMapping(value = "selectByOrderId")
    public personalTrainerOrder sss(Integer id){
        return  personalTrainerOrderService.selectByOrderId(id);
    }
    //删除
    @RequestMapping(value = "delete")
    public void m11(Integer id){
        personalTrainerOrderService.delete(id);
    }
    //修改
    @RequestMapping(value = "update")
    public void m22(personalTrainerOrder personalTrainerOrder){
        System.out.println(personalTrainerOrder);
        personalTrainerOrderService.update(personalTrainerOrder);
    }
}
