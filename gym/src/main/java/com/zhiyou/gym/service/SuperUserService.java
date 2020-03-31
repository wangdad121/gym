package com.zhiyou.gym.service;

import com.zhiyou.gym.entity.ResponseData;
import com.zhiyou.gym.mapper.SuperUserMapper;
import com.zhiyou.gym.pojo.SuperUser;

public interface SuperUserService  {

    public ResponseData FindAccount(SuperUser superUser );
}
