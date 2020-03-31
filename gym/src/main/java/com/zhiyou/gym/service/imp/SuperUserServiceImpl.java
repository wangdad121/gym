package com.zhiyou.gym.service.imp;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zhiyou.gym.entity.ResponseCode;
import com.zhiyou.gym.entity.ResponseData;
import com.zhiyou.gym.mapper.SuperUserMapper;
import com.zhiyou.gym.pojo.SuperUser;
import com.zhiyou.gym.service.SuperUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
@Service
public class SuperUserServiceImpl implements SuperUserService {
@Autowired
    SuperUserMapper superUserMapper;
    @Override
    public ResponseData FindAccount(SuperUser superUser) {
        ResponseData responseData=   new ResponseData<>();
        if(superUser.getAccount().isEmpty()){
            responseData.setCode(ResponseCode.ACCOUNT_ERROR.getCode());
            responseData.setMsg(ResponseCode.ACCOUNT_ERROR.getMsg());
            return responseData;
        }
        if(superUser.getPassword().isEmpty()){
            responseData.setCode(ResponseCode.ACCOUNT_ERROR.getCode());
            responseData.setMsg(ResponseCode.ACCOUNT_ERROR.getMsg());
            return responseData;
        }
        SuperUser a= superUserMapper.FindAccount(superUser.getAccount());
        if(a==null){
            responseData.setCode(ResponseCode.ERROR_LOGIN.getCode());
            responseData.setMsg(ResponseCode.ERROR_LOGIN.getMsg());
            return responseData;
        }
        if(!a.getPassword().equals(superUser.getPassword())){
            responseData.setCode(ResponseCode.ERROR_LOGIN.getCode());
            responseData.setMsg(ResponseCode.ERROR_LOGIN.getMsg());
            return responseData;
        }
        responseData.setCode(ResponseCode.SUCCESS.getCode());
        responseData.setData(a);
        responseData.setMsg(ResponseCode.SUCCESS.getMsg());
        return responseData;
    }
}
