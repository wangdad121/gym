package com.zhiyou.gym.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou.gym.pojo.SuperUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SuperUserMapper extends BaseMapper<SuperUser> {
    @Select("select * from superuser where account=#{account}")
    public SuperUser FindAccount(String account);

}
