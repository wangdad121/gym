package com.zhiyou.gym.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhiyou.gym.mapper.GymCabinetMapper;
import com.zhiyou.gym.pojo.Gym_Cabinet;
import com.zhiyou.gym.service.GymCabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Cabinet")
public class GymCabinetController {
    @Autowired
    GymCabinetService gymCabinetService;
    @Autowired
    GymCabinetMapper gymCabinetMapper;


    @RequestMapping(value = "findAll")
    public IPage<Gym_Cabinet> findAll(Integer page) {
        IPage<Gym_Cabinet> Cabinet = new Page<>(page, 3);//参数一是当前页，参数二是每页个数
        Cabinet = gymCabinetMapper.selectPage(Cabinet, null);


        return Cabinet;
    }

    @RequestMapping(value = "add")
    public void add(Gym_Cabinet gymcabinet) {
        gymCabinetService.add(gymcabinet);
    }

    @RequestMapping(value = "delete")
    public void delete(Gym_Cabinet gymcabinet) {
        gymCabinetService.deleteById(gymcabinet.getCabid());
    }

    @RequestMapping(value = "update")
    public void update(Gym_Cabinet gymcabinet) {
        gymCabinetService.update(gymcabinet);
    }
}
