package com.zhiyou.gym.service;

import com.zhiyou.gym.pojo.gymCabinet;

import java.util.List;

public interface GymCabinetService  {
    //查询所有柜子的信息
    List<gymCabinet> selectAll();
    //添加实体柜子
    void inserGymCabinet(gymCabinet gymCabinet);
    //删除实体柜子
    void deleteGymCabinet(Integer id);
    //查询空闲的柜子
    List<gymCabinet> selectAllByStatic();
}
