package com.zhiyou.gym.service;

import com.zhiyou.gym.pojo.Gym_Cabinet;

import java.util.List;

public interface GymCabinetService {
    public void add(Gym_Cabinet cabinet);
    public void deleteById(int id);
    public void update(Gym_Cabinet cabinet);
    public List<Gym_Cabinet> findAll();

}
