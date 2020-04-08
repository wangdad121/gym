package com.zhiyou.gym.service.imp;

import com.zhiyou.gym.mapper.UserLeagueClassMapper;
import com.zhiyou.gym.mapper.leagueClassMapper;
import com.zhiyou.gym.pojo.UserLeagueClass;
import com.zhiyou.gym.pojo.leagueClass;
import com.zhiyou.gym.service.UserLeagueClassService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLeagueClassServiceImp implements UserLeagueClassService {
    @Autowired
    private UserLeagueClassMapper userLeagueClassMapper;
    @Autowired
    private com.zhiyou.gym.mapper.leagueClassMapper leagueClassMapper;
    @Override
    public List<UserLeagueClass> selectAllByUserId(Integer id) {
        return userLeagueClassMapper.selectAll(id
        );
    }

    @Override
    public void deleteByUserId(Integer id) {
        UserLeagueClass us = userLeagueClassMapper.selectById(id);
        leagueClass ll = leagueClassMapper.selectByid(us.getLeagueClassId());
        ll.setLeagueClassShujuStatic(ll.getLeagueClassShujuStatic()-1);
        leagueClassMapper.updateLea(ll);
        userLeagueClassMapper.deleteById(id);
    }

    @Override
    public Integer selectAllBylIdAndUId(Integer leagueid, Integer userid) {
        UserLeagueClass userLeagueClass = userLeagueClassMapper.selectAllBylIdAndUId(leagueid, userid);

        if(userLeagueClass != null){
            return 1;
        }
       return 0;

    }

    @Override
    public void insert(UserLeagueClass userLeagueClass) {
       /* com.zhiyou.keepproject.pojo.leagueClass leagueClass1 = leagueClassMapper.selectById(userLeagueClass.getLeagueClassId());
        leagueClass1.setLeagueClassShujuStatic(leagueClass1.getLeagueClassShujuStatic()+1);
        leagueClassMapper.updateById(leagueClass1);*/
        leagueClass ll = leagueClassMapper.selectByid(userLeagueClass.getLeagueClassId());
        ll.setLeagueClassShujuStatic(ll.getLeagueClassShujuStatic()+1);
        leagueClassMapper.updateLea(ll);
        userLeagueClassMapper.insert(userLeagueClass);
    }
}
