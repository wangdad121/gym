package com.zhiyou.gym.controller;

import com.zhiyou.gym.pojo.UserAdmin;
import com.zhiyou.gym.service.UserAdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("userAdmin")
public class UserAdminController {
    @Autowired
    private UserAdminService userAdminService;

    //查询会员卡
    @RequestMapping("select")
    public List<UserAdmin> m1(){
        return  userAdminService.selectAll();
    }
    //删除会员卡
    @RequestMapping("delete")
    public void  m2(Integer id){
        userAdminService.deleteById(id);
    }
    //通过会员的id（不是会员卡的id）删除
    @RequestMapping(value = "deleteByUserId")
    public void mm(Integer id){
        userAdminService.deleteByUserId(id);
    }
    //添加会员卡
    @RequestMapping("insert")
    public void m3(UserAdmin userAdmin){
        userAdminService.insertUserAdmin(userAdmin);
    }
}
