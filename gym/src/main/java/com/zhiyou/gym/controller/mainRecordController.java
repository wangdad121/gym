package com.zhiyou.gym.controller;

import com.zhiyou.gym.pojo.mainRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mainRecord")
public class mainRecordController {
    @Autowired
    private com.zhiyou.gym.service.mainRecordService mainRecordService;
    //删除修缮记录
    @RequestMapping(value = "delete")
    public void m1(Integer id)
    {
        mainRecordService.deletemainRecord(id);
    }
    //添加修缮记录
    @RequestMapping(value = "insert")
    public void m2(mainRecord mainRecord){
        mainRecordService.insermainRecord(mainRecord);
    }
    //修改修缮记录
    @RequestMapping(value = "update")
    public void m3(mainRecord mainRecord){
        mainRecordService.updatemainRecord(mainRecord);
    }
    //查询修缮记录
    @RequestMapping(value = "select")
    public List<mainRecord> m4(){
      return   mainRecordService.selectAllmainRecord();
    }
}
