package com.zhiyou.gym.job;

import com.zhiyou.gym.mapper.UserMapper;
import com.zhiyou.gym.pojo.User;
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
import java.util.List;

public class MyJob extends QuartzJobBean {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        String key="user:info";
        List<User> users = userMapper.selectList(null);
        ValueOperations op = redisTemplate.opsForValue();
        op.set(key,users);

        //System.out.println("===============开始刷新会员信息啦~~~我在job包下");
    }
}
