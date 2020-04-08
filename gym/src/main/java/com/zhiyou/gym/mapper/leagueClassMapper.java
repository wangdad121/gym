package com.zhiyou.gym.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou.gym.pojo.leagueClass;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface leagueClassMapper  extends BaseMapper<leagueClass> {
    //查询所有团课
    @Select(value = "SELECT l.*,p.personal_trainer_name as league_class_personal_trainer_name from league_class l INNER JOIN personal_trainer p on l.league_class_personal_trainer_id=p.id")
    List<leagueClass> selectAll();
    //通过id查询团课
    @Select(value = "SELECT l.*,p.personal_trainer_name as league_class_personal_trainer_name from league_class l INNER JOIN personal_trainer p on l.league_class_personal_trainer_id=p.id where l.id=#{id}")
    leagueClass selectByid(Integer id);
    //修改团课
    @Update(value = "UPDATE league_class  SET league_class_shuju_static=#{leagueClassShujuStatic}   WHERE id=#{id}")
    void updateLea(leagueClass leagueClass);
}
