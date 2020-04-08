package com.zhiyou.gym.service.imp;

import com.zhiyou.gym.mapper.GymCabinetMapper;
import com.zhiyou.gym.pojo.gymCabinet;
import com.zhiyou.gym.service.GymCabInfoService;
import com.zhiyou.gym.service.GymCabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GymCabinetServiceImp implements GymCabinetService {
    @Autowired
    private GymCabinetMapper gymCabinetMapper;
    @Autowired
    private GymCabInfoService gymCabInfoService;
    @Override
    public List<gymCabinet> selectAll() {

        return gymCabinetMapper.selectList(null);
    }

    @Override
    public void inserGymCabinet(gymCabinet gymCabinet) {
        Date date = new Date();
        gymCabinet.setCabNumber(Integer.valueOf((int) date.getTime()));
        gymCabinetMapper.insert(gymCabinet);
    }

    @Override
    public void deleteGymCabinet(Integer id) {
        gymCabInfoService.deleteByNetId(id);
        gymCabinetMapper.deleteById(id);
    }

    @Override
    public List<gymCabinet> selectAllByStatic() {
        return gymCabinetMapper.selectAllByStatic();
    }
}
