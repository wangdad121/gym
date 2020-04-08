package com.zhiyou.gym.service;

import com.zhiyou.gym.entity.ResponseData;
import com.zhiyou.gym.pojo.AdminLogin;


public interface AdminLoginService {
    //超级管理员账号密码登陆
    ResponseData selectByAccAndPass(String account, String password);
    //通过账号查询对象
    AdminLogin selectByAccount(String account);
}
