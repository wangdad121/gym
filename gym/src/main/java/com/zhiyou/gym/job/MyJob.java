package com.zhiyou.gym.job;

import com.zhiyou.gym.mapper.GymCabinetMapper;
import com.zhiyou.gym.service.GymCabinetService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.scheduling.quartz.QuartzJobBean;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyJob extends QuartzJobBean {

    private final Logger logger = LoggerFactory.getLogger(MyJob.class);
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    GymCabinetMapper gymCabinetMapper;
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        String key = "Cabinet";
        ValueOperations<String, String> operations = redisTemplate.opsForValue();
        if(redisTemplate.hasKey(key)){
            operations.get(key);
        }
        if( redisTemplate.hasKey(key).booleanValue()==false){
            operations.set(key, String.valueOf(gymCabinetMapper.selectList(null)));

        }
    }
}
