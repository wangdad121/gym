package com.zhiyou.gym.service.imp;

import com.zhiyou.gym.mapper.personalTrainerOrderMapper;
import com.zhiyou.gym.pojo.User;
import com.zhiyou.gym.pojo.personalTrainerOrder;
import com.zhiyou.gym.service.personalTrainerOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class personalTrainerOrderServiceImp  implements personalTrainerOrderService {
    @Autowired
    private com.zhiyou.gym.mapper.personalTrainerOrderMapper personalTrainerOrderMapper;
    @Override
    public void insertpersonalTrainerOrder(personalTrainerOrder personalTrainerOrder) {
        personalTrainerOrder.setUserId(0);
        personalTrainerOrder.setShuju(0);
        personalTrainerOrderMapper.insert(personalTrainerOrder);
    }

    @Override
    public List<User> selectAllUByperorderId(Integer id) {
        return personalTrainerOrderMapper.selectAllUByperorderId(id);
    }

    @Override
    public List<personalTrainerOrder> selectPByUserId(Integer id) {
        return personalTrainerOrderMapper.selectPByUserId(id);
    }

    @Override
    public List<personalTrainerOrder> slectById(Integer id) {
        return personalTrainerOrderMapper.slectById1(id);
    }

    @Override
    public void update(personalTrainerOrder personalTrainerOrder) {
        personalTrainerOrderMapper.updateById(personalTrainerOrder);
        com.zhiyou.gym.pojo.personalTrainerOrder personalTrainerOrder1 = personalTrainerOrderMapper.selectById(personalTrainerOrder.getId());
        personalTrainerOrder1.setShuju(personalTrainerOrder1.getShuju()+1);
        personalTrainerOrderMapper.updateById(personalTrainerOrder1);


    }

    @Override
    public void delete(Integer id) {
            personalTrainerOrderMapper.deleteById(id);
    }

    @Override
    public personalTrainerOrder selectByOrderId(Integer id) {
        return personalTrainerOrderMapper.selectById(id);
    }

    @Override
    public void updateBypId(personalTrainerOrder personalTrainerOrder) {
        personalTrainerOrderMapper.updateBypId(personalTrainerOrder);
    }
}
