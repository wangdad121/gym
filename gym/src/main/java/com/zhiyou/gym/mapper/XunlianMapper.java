package com.zhiyou.gym.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou.gym.pojo.Xunlian;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface XunlianMapper  extends BaseMapper<Xunlian> {
    @Select(value = "SELECT x.*,`user`.`name` as user_name from xunlian x INNER JOIN `user` ON x.user_id=`user`.id ")
    List<Xunlian> selectAll();
    @Select(value = "SELECT x.*,`user`.`name` as user_name from xunlian x INNER JOIN `user` ON x.user_id=`user`.id where x.user_id=#{id}")
    List<Xunlian> selectByXunLianId(Integer id);
}
