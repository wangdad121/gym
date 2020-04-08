package com.zhiyou.gym.mapper;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou.gym.pojo.Schedule;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScheduleMapper extends BaseMapper<Schedule> {
     //通过教练id查询日程
    @Select(value = "SELECT s.*,p.personal_trainer_name from `schedule` s INNER JOIN personal_trainer p on s.personal_trainer_id = p.id WHERE p.id=#{pid}")
    List<Schedule> selectAll(Integer pid);
    //查询所有日程
    //todo 查询所有日程
    //通过id查询日程
    @Select(value = "SELECT s.*,p.personal_trainer_name from `schedule` s INNER JOIN personal_trainer p on s.personal_trainer_id = p.id WHERE s.id=#{pid}")
    Schedule selectByid(Integer pid);
}
