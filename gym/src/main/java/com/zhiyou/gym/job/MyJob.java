package com.zhiyou.gym.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyJob extends QuartzJobBean {

    private final Logger logger = LoggerFactory.getLogger(MyJob.class);
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        logger.info("time===>"+time);

    }
}
