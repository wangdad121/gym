package com.zhiyou.gym.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou.gym.pojo.personalTrainer;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface personalTrainerMapper extends BaseMapper<personalTrainer> {
    //通过教练账号登陆
    @Select(value = "select * from personal_trainer where personal_traniner_account=#{personalTraninerAccount}")
    personalTrainer selectByPersonalAccount(String personalTraninerAccount);
}
