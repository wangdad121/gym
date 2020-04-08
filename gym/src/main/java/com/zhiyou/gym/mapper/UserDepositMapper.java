package com.zhiyou.gym.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou.gym.pojo.UserDeposit;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDepositMapper extends BaseMapper<UserDeposit> {
    @Select(value = "SELECT d.*,u.`name` from user_deposit d INNER JOIN `user` u on d.user_id=u.id ")
    List<UserDeposit> selectAll();
}
