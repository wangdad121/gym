package com.zhiyou.gym.service.imp;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.zhiyou.gym.mapper.Gym_Cab_InfoMapper;
import com.zhiyou.gym.pojo.Gym_Cab_Info;
import com.zhiyou.gym.pojo.Gym_Cabinet;
import com.zhiyou.gym.service.Gym_Cab_InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class Gym_Cab_InfoServiceImpl implements Gym_Cab_InfoService {
   @Autowired
    Gym_Cab_InfoMapper gym_cab_infoMapper;
   //查询全部
    @Override
    public List<Gym_Cab_Info> FindAll() {
        System.out.println( gym_cab_infoMapper.selectList(null));
        return  gym_cab_infoMapper.selectList(null);
    }

    @Override
    public void add(Gym_Cab_Info cabinet) {
        gym_cab_infoMapper.insert(cabinet);
    }

    @Override
    public void deleteById(int id) {
   gym_cab_infoMapper.deleteById(id);
    }

    @Override
    public void update(Gym_Cab_Info cabinet) {
        UpdateWrapper<Gym_Cab_Info> wrapper = new UpdateWrapper<>();
        gym_cab_infoMapper.update(cabinet,wrapper);
    }
}
