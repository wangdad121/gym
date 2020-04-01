package com.zhiyou.gym.controller;

import com.zhiyou.gym.pojo.Gym_Cab_Info;
import com.zhiyou.gym.service.imp.Gym_Cab_InfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "GymCabInfo")
public class Gym_Cab_InfoController {
    @Autowired
    Gym_Cab_InfoServiceImpl gym_cab_infoService;
    @RequestMapping(value = "findAll")
    public List<Gym_Cab_Info> FindAll() {
        return gym_cab_infoService.FindAll();
    }
    @RequestMapping(value = "add")
    public void  FindAll(Gym_Cab_Info gymcabinfo) {
        gym_cab_infoService.add(gymcabinfo);
    }
    @RequestMapping(value = "delete")
    public void  delete(int id) {
        gym_cab_infoService.deleteById(id);
    }
    @RequestMapping(value = "update")
    public void  update(Gym_Cab_Info gymcabinfo) {
        gym_cab_infoService.update(gymcabinfo);
    }
}
