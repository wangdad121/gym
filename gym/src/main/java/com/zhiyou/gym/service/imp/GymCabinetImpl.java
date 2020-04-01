package com.zhiyou.gym.service.imp;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.zhiyou.gym.mapper.GymCabinetMapper;
import com.zhiyou.gym.pojo.Gym_Cabinet;
import com.zhiyou.gym.service.GymCabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GymCabinetImpl implements GymCabinetService {
    @Autowired
    GymCabinetMapper gymCabinetMapper;
    @Override
    public void add(Gym_Cabinet cabinet) {
        gymCabinetMapper.insert(cabinet);
    }

    @Override
    public void deleteById(int id) {
    gymCabinetMapper.deleteById(id);
    }

    @Override
    public void update(Gym_Cabinet cabinet) {
        UpdateWrapper<Gym_Cabinet> wrapper = new UpdateWrapper<>();
        gymCabinetMapper.update(cabinet,wrapper);
    }

    @Override
    public List<Gym_Cabinet> findAll() {
        return gymCabinetMapper.selectList(null);
    }

}
