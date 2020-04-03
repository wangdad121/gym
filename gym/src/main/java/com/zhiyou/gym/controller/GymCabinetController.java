package com.zhiyou.gym.controller;

import com.zhiyou.gym.pojo.Gym_Cabinet;
import com.zhiyou.gym.service.GymCabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Controller
@RequestMapping(value = "Cabinet")
public class GymCabinetController {
    @Autowired
    GymCabinetService gymCabinetService;
    @RequestMapping(value = "findAll")
    public String findAll(){
        gymCabinetService.findAll();
        return "cabinet.html";
    }
   @RequestMapping(value = "add")
    public void  add(Gym_Cabinet gymcabinet){
        gymCabinetService.add(gymcabinet);
   }
    @RequestMapping(value = "delete")
    public void  delete(Gym_Cabinet gymcabinet){
        gymCabinetService.deleteById(gymcabinet.getCabid());
    }
    @RequestMapping(value = "update")
    public void  update(Gym_Cabinet gymcabinet){
        gymCabinetService.update(gymcabinet);
    }
}
