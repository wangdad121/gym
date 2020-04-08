package com.zhiyou.gym.service;

import com.zhiyou.gym.pojo.GymCabInfo;


import java.util.List;

public interface GymCabInfoService {
    //添加租柜
    void insertGymCabInfo(GymCabInfo gymCabInfo);
    //删除租柜
    void deleteGymCabInfo(Integer id);
    //查询租柜
    List<GymCabInfo> selectAll();
    //通过租柜id删除租柜信息
    void deleteByNetId(Integer id);

}
