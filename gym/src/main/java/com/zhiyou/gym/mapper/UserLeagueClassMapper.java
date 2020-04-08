package com.zhiyou.gym.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou.gym.pojo.UserLeagueClass;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserLeagueClassMapper extends BaseMapper<UserLeagueClass> {
    @Select(value = "select * from user_league_class where user_id=#{id}")
    List<UserLeagueClass> selectAll(Integer id);
    //通过团课id和会员查询是否有记录
    @Select(value = "select * from user_league_class where league_class_id=#{leagueid} and user_id=#{userid}")
    UserLeagueClass selectAllBylIdAndUId(Integer leagueid, Integer userid);
}
