package com.zhiyou.gym.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou.gym.pojo.GymCabInfo;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GymCabInfoMapper extends BaseMapper<GymCabInfo> {
    //通过租柜id删除租柜信息
    @Delete(value = "delete from gym_cab_info where cab_cabinet_id=#{id}")
    void deleteByNetId(Integer id);
}
