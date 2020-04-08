package com.zhiyou.gym.service.imp;

import com.zhiyou.gym.mapper.ScheduleMapper;
import com.zhiyou.gym.pojo.Schedule;
import com.zhiyou.gym.service.ScheduleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class ScheduleServiceImp implements ScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    @Override
    public Schedule selectById(Integer id) {
        return scheduleMapper.selectByid(id);
    }

    @Override
    public List<Schedule> selectAll(Integer id) {
        return scheduleMapper.selectAll(id);
    }

    @Override
    public void insert(Schedule schedule) {
        Date date = new Date();
        schedule.setScheduleNumber(Integer.valueOf((int) date.getTime()));
        scheduleMapper.insert(schedule);
    }

    @Override
    public void update(Schedule schedule) {
        scheduleMapper.updateById(schedule);
    }

    @Override
    public void delete(Integer id) {
        scheduleMapper.deleteById(id);
    }
}
