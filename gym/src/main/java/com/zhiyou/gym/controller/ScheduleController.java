package com.zhiyou.gym.controller;

import com.zhiyou.gym.pojo.Schedule;
import com.zhiyou.gym.service.ScheduleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "schedule")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;
    //通过日程id查询
    @RequestMapping(value = "selectById")
    public Schedule ss(Integer id){
        return  scheduleService.selectById(id);
    }
    //通过教练id查询
    @RequestMapping(value = "select")
    public List<Schedule> m1(Integer id){
        return  scheduleService.selectAll(id);
    }
    //删除
    @RequestMapping(value = "delete")
    public void  m2(Integer id){
        scheduleService.delete(id);
    }
    //添加
    @RequestMapping(value = "insert")
    public void m3(Schedule schedule){
        scheduleService.insert(schedule);
    }
    //修改
    @RequestMapping(value = "update")
    public void m4(Schedule schedule){
        scheduleService.update(schedule);
    }
}
