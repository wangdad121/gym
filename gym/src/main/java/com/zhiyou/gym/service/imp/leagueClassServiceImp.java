package com.zhiyou.gym.service.imp;

import com.zhiyou.gym.mapper.UserLeagueClassMapper;
import com.zhiyou.gym.mapper.leagueClassMapper;
import com.zhiyou.gym.pojo.leagueClass;
import com.zhiyou.gym.service.leagueClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class leagueClassServiceImp implements leagueClassService {
    @Autowired
    private com.zhiyou.gym.mapper.leagueClassMapper leagueClassMapper;
    @Autowired
    private UserLeagueClassMapper userleagueClassmapper;
     @Override
    public List<leagueClass> selectAllleagueClass() {
        return leagueClassMapper.selectAll();
    }

    @Override
    public leagueClass selectById(Integer id) {
        return leagueClassMapper.selectByid(id);
    }

    @Override
    public void updateleagueClass(leagueClass leagueClass) {
        leagueClassMapper.updateById(leagueClass);
    }

    @Override
    public void deleteleagueClassByid(Integer id) {
        leagueClassMapper.deleteById(id);
    }

    @Override
    public void insertleagueClass(leagueClass leagueClass) {
        Date date = new Date();
        leagueClass.setLeagueClassNumber(Integer.valueOf((int) date.getTime()));
        leagueClassMapper.insert(leagueClass);

    }
}
