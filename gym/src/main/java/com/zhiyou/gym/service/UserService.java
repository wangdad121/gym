package com.zhiyou.gym.service;

import com.zhiyou.gym.pojo.User;


import java.util.List;

public interface UserService{
    //添加会员并返回该条数据id
    Integer insertIntoUserFId(User user);
    //添加会员
    public void insertUser(User user);
    //删除会员
    void deleteUser(Integer id);
    //修改会员
    void updateUer(User user);
    //查询会员
    List<User> selectAllUser();
    //通过id查询会员
    User selectById(Integer id);
}
