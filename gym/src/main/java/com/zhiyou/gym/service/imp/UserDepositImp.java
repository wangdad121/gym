package com.zhiyou.gym.service.imp;

import com.zhiyou.gym.entity.ResponseData;
import com.zhiyou.gym.mapper.UserDepositMapper;
import com.zhiyou.gym.pojo.UserDeposit;
import com.zhiyou.gym.service.UserDepositService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserDepositImp  implements UserDepositService {
    @Autowired
    private UserDepositMapper userDepositMapper;
    @Override
    public void inserUserDeposit(UserDeposit userDeposit) {
        Date date = new Date();
        userDeposit.setUserDepositNumber(Integer.valueOf((int) date.getTime()));
        userDeposit.setUserDepositStatic("已完成");
        userDepositMapper.insert(userDeposit);
    }

    @Override
    public ResponseData selectAllUserDeposit() {
        ResponseData<Object> a = new ResponseData<>();
        a.setData(userDepositMapper.selectAll());
        return a;
    }
}
