package com.zhiyou.gym.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhiyou.gym.pojo.Paike;
import com.zhiyou.gym.service.PaikeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Paike")
public class PaikeController {
    @Autowired
    private PaikeService paikeService;
    //查询所有排课
    @RequestMapping(value = "select")
    public List<Paike> m1(){


        return  paikeService.selectAllPaike();
    }
    //删除排课
    @RequestMapping(value = "delete")
    public void m2(Integer id){
        paikeService.deletePaikeById(id);
    }
    //修改排课
    @RequestMapping(value = "update")
    public void m3(Paike paike){
        paikeService.updatePaike(paike);
    }
    //添加排课
    @RequestMapping(value = "insert")
    public void m4(Paike paike)
    {
        paikeService.insertPaike(paike);
    }
}
