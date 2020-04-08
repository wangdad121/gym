package com.zhiyou.gym.controller;


import com.zhiyou.gym.pojo.UserLeagueClass;
import com.zhiyou.gym.service.UserLeagueClassService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;
import java.util.List;

@RestController
@RequestMapping(value = "userLeagueClass")
public class UserLeagueController {
    @Autowired
    private UserLeagueClassService userLeagueClassService;
    @RequestMapping(value = "selectAllByUserId")
    public List<UserLeagueClass> m1(Integer id){
        return userLeagueClassService.selectAllByUserId(id);
    }
    @RequestMapping(value = "delete")
    public void m2(Integer id){
        userLeagueClassService.deleteByUserId(id);
    }
    @RequestMapping(value = "selectByLidAdnUid")
    public Integer m3(Integer leagueId,Integer uId){
       return userLeagueClassService.selectAllBylIdAndUId(leagueId,uId);
    }
    @RequestMapping(value = "insert")
    public void m4(UserLeagueClass userLeagueClass){
         userLeagueClassService.insert(userLeagueClass);
    }


}
