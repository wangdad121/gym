package com.zhiyou.gym.controller;

import com.zhiyou.gym.entity.ResponseData;
import com.zhiyou.gym.pojo.Region;
import com.zhiyou.gym.service.RegionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "region")
public class RegionController {
    @Autowired
    private RegionService regionService;
    //前台签到
    @RequestMapping("insert")
    public  void m1(Region region){
        regionService.insertRegion(region);
    }
    //查询所有前台
    @RequestMapping("select")
    public ResponseData m2(){
        return  regionService.selectAllRegion();
    }
    //删除
    @RequestMapping(value = "delete")
    public void m3(Integer id)
    {
        regionService.deleteById(id);
    }
}
