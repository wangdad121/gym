package com.zhiyou.gym.service;

import com.zhiyou.gym.entity.ResponseData;
import com.zhiyou.gym.pojo.YoukeInto;


public interface YoukeIntoService {
    //游客登记（添加数据）
    void inserYoukeInto(YoukeInto youkeInto);
    //查询游客
    ResponseData selectYoukeInto();
    //删除游客
    void deleteYouke(Integer id);
    //通过id查询游客
    YoukeInto selectById(Integer id);
    //修改游客
    void updateYouke(YoukeInto youkeInto);
}
