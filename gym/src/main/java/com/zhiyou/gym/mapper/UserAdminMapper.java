package com.zhiyou.gym.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou.gym.pojo.UserAdmin;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserAdminMapper extends BaseMapper<UserAdmin> {
    //查询
    @Select(value = "SELECT ua.*,`user`.`name` as user_name  from user_admin ua INNER JOIN `user` ON ua.user_id =`user`.id")
    List<UserAdmin> selectAll();
    //通过会员id删除
    @Delete(value = "delete from user_admin where user_id=#{id}")
    void deleteByUserId(Integer id);
    //通过会员卡id查询
    @Select(value = "SELECT id,user_admin_number,user_id,start_time,end_time,balance,user_admin_static FROM user_admin WHERE id=#{id}")
    UserAdmin selectById(Integer id);
}
