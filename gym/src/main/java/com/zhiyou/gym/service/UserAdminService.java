package com.zhiyou.gym.service;

import com.zhiyou.gym.pojo.UserAdmin;


import java.util.List;

public interface UserAdminService {
    //查询所有会员卡信息
    List<UserAdmin> selectAll();
    //删除会员卡
    void deleteById(Integer id);
    //添加会员卡
    void insertUserAdmin(UserAdmin userAdmin);
    //通过会员id删除会员卡
    void deleteByUserId(Integer id);
}
