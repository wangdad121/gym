package com.zhiyou.gym.service;

import com.zhiyou.gym.entity.ResponseData;
import com.zhiyou.gym.pojo.Region;

public interface RegionService {
    //前台添加
    void  insertRegion(Region region);
    //显示所有前台
    ResponseData selectAllRegion();
    //删除
    void deleteById(Integer id);
}
