package com.zhiyou.gym.controller;

import com.zhiyou.gym.pojo.leagueClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;
import java.util.List;

@RestController
@RequestMapping(value = "leagueClass")
public class LeagueClassController {
    @Autowired
    private com.zhiyou.gym.service.leagueClassService leagueClassService;

    //查询
    @RequestMapping(value = "select")
    public List<leagueClass> m1(){
        return  leagueClassService.selectAllleagueClass();
    }
    //通过id查询团课
    @RequestMapping("selectById")
    public leagueClass mm(Integer id){
        return leagueClassService.selectById(id);
    }
    //修改团课
    @RequestMapping(value = "update")
    public void m2(leagueClass leagueClass){
        leagueClassService.updateleagueClass(leagueClass);
    }
    //删除团课
    @RequestMapping(value = "delete")
    public void m3(Integer id){
        leagueClassService.deleteleagueClassByid(id);
    }
    //添加团课
    @RequestMapping(value = "insert")
    public void m4(leagueClass leagueClass){
        leagueClassService.insertleagueClass(leagueClass);
    }
}
