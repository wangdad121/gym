package com.zhiyou.gym.service.imp;

import com.zhiyou.gym.entity.ResponseCode;
import com.zhiyou.gym.entity.ResponseData;
import com.zhiyou.gym.mapper.AdminLoginMapper;
import com.zhiyou.gym.mapper.UserMapper;
import com.zhiyou.gym.mapper.personalTrainerMapper;
import com.zhiyou.gym.pojo.AdminLogin;
import com.zhiyou.gym.pojo.User;
import com.zhiyou.gym.pojo.personalTrainer;
import com.zhiyou.gym.service.AdminLoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminLoginServiceImp implements AdminLoginService {
    @Autowired
    private AdminLoginMapper adminLoginMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private com.zhiyou.gym.mapper.personalTrainerMapper personalTrainerMapper;
    @Override
    public ResponseData<AdminLogin> selectByAccAndPass(String account, String password) {
        ResponseData a = new ResponseData<>();
        if(account.isEmpty()){
            a.setCode(ResponseCode.ERROR_NULL.getCode());
            a.setMsg(ResponseCode.ERROR_NULL.getMsg());
            return a;
        }
        if(password.isEmpty()){
            a.setCode(ResponseCode.ERROR_NULL.getCode());
            a.setMsg(ResponseCode.ERROR_NULL.getMsg());
            return a;
        }
        AdminLogin user = adminLoginMapper.selectByAccount(account);
        if(user != null){
            if (user.getPassword().equals(password)){
                a.setCode(ResponseCode.SUCCESS.getCode());
                a.setMsg("超级管理员");
                a.setData(adminLoginMapper.selectByAccount(account));
                return a;
            }
        }
        User user1 = userMapper.selectByUserAccount(account);
        if(user1 != null)
        {
            if(user1.getUserPassword().equals(password)){
                User uu = userMapper.selectByUserAccount(account);
                a.setCode(ResponseCode.SUCCESS.getCode());
                a.setMsg("会员");
                a.setData(uu);
                return a;
            }
        }
        personalTrainer user2 = personalTrainerMapper.selectByPersonalAccount(account);
        if(user2 != null)
        {
            if(user2.getPersonalTraninerPassword().equals(password)){
                personalTrainer jiaolian = personalTrainerMapper.selectByPersonalAccount(account);
                a.setCode(ResponseCode.SUCCESS.getCode());
                a.setMsg("教练");
                a.setData(jiaolian);
                return a;
            }
        }

        a.setCode(ResponseCode.ERROR_LOGIN.getCode());
        a.setMsg(ResponseCode.ERROR_LOGIN.getMsg());
        return a;
    }

    @Override
    public AdminLogin selectByAccount(String account) {
        return adminLoginMapper.selectByAccount(account);
    }
}
