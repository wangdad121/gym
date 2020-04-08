package com.zhiyou.gym.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zhiyou.gym.pojo.personalTrainer;


import java.util.List;

public interface personalTrainerService {
    //分页查询所有教练
    IPage<personalTrainer> selectAllpersonalTrainer(Integer page);
    //查询所有教练
    List<personalTrainer> selectAll();
    //修改教练信息
    void updatepersonalTrainer(personalTrainer personalTrainer);
    //添加教练
    void insertpersonalTrainer(personalTrainer personalTrainer);
    //删除教练
    void deletepersonalTrainer(Integer id);
    //通过id查询教练
    personalTrainer selectPByid(Integer id);
}
