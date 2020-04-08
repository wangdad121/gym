package com.zhiyou.gym.controller;

import com.zhiyou.gym.pojo.Xunlian;
import com.zhiyou.gym.service.XunlianService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("xunlian")
public class XunlianController {
    @Autowired
    private XunlianService xunlianService;
    //通过id查询训练记录
    @RequestMapping(value = "qq")
    public List<Xunlian> m22(Integer id){
        return xunlianService.selectById(id);
    }
    //给会员训练添加记录
    @RequestMapping("insert")
    public void m1(Xunlian xunlian){
        xunlianService.insertXunlian(xunlian);
    }
    //查询训练记录
    @RequestMapping(value = "select")
    public List<Xunlian> m2(){
        return xunlianService.selectAll();
    }



    //删除
    @RequestMapping(value = "delete")
    public  void mm(Integer id){
        xunlianService.deleteById(id);
    }
}
