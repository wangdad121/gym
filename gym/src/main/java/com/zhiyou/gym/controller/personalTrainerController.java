package com.zhiyou.gym.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zhiyou.gym.ifconfig.QiniuUtil;
import com.zhiyou.gym.pojo.personalTrainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("personalTrainer")
public class personalTrainerController {
    @Autowired
    private com.zhiyou.gym.service.personalTrainerService personalTrainerService;
    @Autowired
    private QiniuUtil qiniuUtil;
    //查询分页所有教练
    @RequestMapping(value = "select")
    public IPage<personalTrainer> m1(Integer page){
        return  personalTrainerService.selectAllpersonalTrainer(page);
    }
    //查询有所有教练
    @RequestMapping(value = "selectAll")
    public List<personalTrainer> mm(){
        return personalTrainerService.selectAll();
    }
    //修改教练信息
    @PostMapping(value = "update")
    public void m2(@RequestParam(value = "file",required = false) MultipartFile file
            , @RequestParam(value = "id") Integer id
            , @RequestParam(value = "personalTrainerName") String personalTrainerName
            , @RequestParam(value = "personalTrainerAge") Integer personalTrainerAge
            , @RequestParam(value = "personalTrainerHobbit") String personalTrainerHobbit
            , @RequestParam(value = "personalTrainerSex") String personalTrainerSex
            , @RequestParam(value = "personalTrainerSpreak") String personalTrainerSpreak
            , @RequestParam(value = "personalTrainerTime") Date personalTrainerTime
            , @RequestParam(value = "personalTrainerStatic") String personalTrainerStatic) throws IOException {
        personalTrainer p = new personalTrainer();

        if(file != null &&!file.isEmpty()){
            String filename = file.getOriginalFilename();
            String path = qiniuUtil.uploadImg((FileInputStream) file.getInputStream(), filename);
            p.setPersonalTrainerPriture(path);
            System.out.println(path);
        }
        p.setId(id);
        p.setPersonalTrainerName(personalTrainerName);
        p.setPersonalTrainerAge(personalTrainerAge);
        p.setPersonalTrainerHobbit(personalTrainerHobbit);
        p.setPersonalTrainerSex(personalTrainerSex);
        p.setPersonalTrainerSpreak(personalTrainerSpreak);
        p.setPersonalTrainerTime(personalTrainerTime);
        p.setPersonalTrainerStatic(personalTrainerStatic);
        personalTrainerService.updatepersonalTrainer(p);
    }
    //添加教练
    @RequestMapping(value = "insert")
    public void m3(personalTrainer personalTrainer)
    {
        personalTrainerService.insertpersonalTrainer(personalTrainer);
    }
    //删除教练
    @RequestMapping(value = "delete")
    public void m4(Integer id)
    {
        personalTrainerService.deletepersonalTrainer(id);
    }
    //通过id查询教练
    @RequestMapping("selectById")
    public personalTrainer m5(Integer id){
        return personalTrainerService.selectPByid(id);
    }
    //添加头像
    @PostMapping(value = "/insertHead")
    public String m1(@RequestParam(value = "file",required = false) MultipartFile file
            , @RequestParam(value = "personalTrainerName") String personalTrainerName
            , @RequestParam(value = "personalTrainerAge") Integer personalTrainerAge
            , @RequestParam(value = "personalTrainerHobbit") String personalTrainerHobbit
            , @RequestParam(value = "personalTrainerSex") String personalTrainerSex
            , @RequestParam(value = "personalTrainerSpreak") String personalTrainerSpreak
            , @RequestParam(value = "personalTrainerTime") Date personalTrainerTime
            , @RequestParam(value = "personalTrainerStatic") String personalTrainerStatic) throws IOException {
        personalTrainer p = new personalTrainer();

        if(file != null &&!file.isEmpty()){
            String filename = file.getOriginalFilename();
            String path = qiniuUtil.uploadImg((FileInputStream) file.getInputStream(), filename);
            p.setPersonalTrainerPriture(path);
        }
        p.setPersonalTrainerName(personalTrainerName);
        p.setPersonalTrainerAge(personalTrainerAge);
        p.setPersonalTrainerHobbit(personalTrainerHobbit);
        p.setPersonalTrainerSex(personalTrainerSex);
        p.setPersonalTrainerSpreak(personalTrainerSpreak);
        p.setPersonalTrainerTime(personalTrainerTime);
        p.setPersonalTrainerStatic(personalTrainerStatic);
        personalTrainerService.insertpersonalTrainer(p);
        System.out.println(p);
        return "添加失败，请重试!";
    }

}
