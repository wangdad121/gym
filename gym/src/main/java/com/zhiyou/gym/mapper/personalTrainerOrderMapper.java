package com.zhiyou.gym.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou.gym.pojo.User;
import com.zhiyou.gym.pojo.personalTrainerOrder;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface personalTrainerOrderMapper extends BaseMapper<personalTrainerOrder> {
    //通过会员id查询我的私教
    @Select(value = "select * from personal_trainer INNER JOIN personal_trainer_order po on personal_trainer.id= po.personal_trainer_id INNER JOIN `user` on `user`.id=#{id}")
    List<personalTrainerOrder> selectPByUserId(Integer id);
    //通过教练id查询我的学员
    @Select(value = "select distinct  u.* from `user` u INNER JOIN personal_trainer_order po on u.id = po.user_id INNER JOIN personal_trainer p on p.id= #{id}")
    List<User> selectAllUByperorderId(Integer id);
    //通过教练id查询表信息
    @Select(value = "select * from personal_trainer_order p where p.personal_trainer_id = #{id} ")
    List<personalTrainerOrder> slectById1(Integer id);
    //通过教练id添加用户id（修改）
    @Update(value = "update personal_trainer_order set user_id=#{userId} where personal_trainer_id =#{personalTrainerId}")
    void updateBypId(personalTrainerOrder personalTrainerOrder);

}
