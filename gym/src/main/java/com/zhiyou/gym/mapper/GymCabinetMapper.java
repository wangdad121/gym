package com.zhiyou.gym.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou.gym.pojo.gymCabinet;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GymCabinetMapper extends BaseMapper<gymCabinet> {
    //查询最大的编号
    @Select(value = "select max(cab_number) from  gym_cabinet ")
    Integer selectBianHao();
    //查询空闲的所有柜子
    @Select(value = "select * from gym_cabinet where cab_status=1")
    List<gymCabinet> selectAllByStatic();
}
