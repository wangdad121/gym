package com.zhiyou.gym.service;

import com.zhiyou.gym.pojo.User;
import com.zhiyou.gym.pojo.personalTrainerOrder;

import java.util.List;

public interface personalTrainerOrderService {
    //会员预约教练(添加)
    void insertpersonalTrainerOrder(personalTrainerOrder personalTrainerOrder);
    //通过教练id查询我的学员
    List<User> selectAllUByperorderId(Integer id);
    // 通过会员id查询我的私教
    List<personalTrainerOrder> selectPByUserId(Integer id);
    //通过教练id查询表信息
    List<personalTrainerOrder> slectById(Integer id);
    //通过id修改
    void update(personalTrainerOrder personalTrainerOrder);
    //删除
    void delete(Integer id);
    //通过表id查询单条数据
    personalTrainerOrder selectByOrderId(Integer id);
    //通过教练id添加会员（修改）
    void updateBypId(personalTrainerOrder personalTrainerOrder);

}
