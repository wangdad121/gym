package com.zhiyou.gym.service;

import com.zhiyou.gym.pojo.mainRecord;

import java.util.List;

public interface mainRecordService {
    //添加维修记录
    void insermainRecord(mainRecord mainRecord);
    //删除维修记录
    void deletemainRecord(Integer id);
    //修改维修记录
    void updatemainRecord(mainRecord mainRecord);
    //查询维修记录
    List<mainRecord> selectAllmainRecord();
}
