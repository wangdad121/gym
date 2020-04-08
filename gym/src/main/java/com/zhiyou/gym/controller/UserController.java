package com.zhiyou.gym.controller;

import com.zhiyou.gym.pojo.User;
import com.zhiyou.gym.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
        //成为会员的流程  潜客等级  会员卡办理 ---
    //添加会员
    @RequestMapping(value = "insert")
    public  void m1(User user){
        userService.insertUser(user);
    }
    //添加会员并返回该条数据的id
    @RequestMapping(value = "insertFId")
    public Integer mm(User user){
        return userService.insertIntoUserFId(user);
    }
    //删除会员
    @RequestMapping(value = "delete")
    public void m2(Integer id)
    {
        userService.deleteUser(id);
    }
    //修改会员
    @RequestMapping(value = "update")
    public void  m3(User user ,String UserStatic)
    {
        userService.updateUer(user);
    }
    //查询会员
    @RequestMapping(value = "select")
    public List<User> m4(){
        return  userService.selectAllUser();
    }
    //通过id查询会员
    @RequestMapping("selectById")
    public User m5(Integer id){
        return  userService.selectById(id);
    }


}
