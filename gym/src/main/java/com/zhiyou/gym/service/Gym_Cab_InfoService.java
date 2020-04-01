package com.zhiyou.gym.service;

import com.zhiyou.gym.pojo.Gym_Cab_Info;

import java.util.List;

public interface Gym_Cab_InfoService {
    public List<Gym_Cab_Info> FindAll();
    public void add(Gym_Cab_Info cabinet);
    public void deleteById(int id);
    public void update(Gym_Cab_Info cabinet);

}
