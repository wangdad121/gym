package com.zhiyou.gym.ifconfig;

import com.zhiyou.gym.job.MyJob;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.QuartzJobBean;

@Configuration
public class QuartzConfig  {
    /**
     * 创建JobDatile对象
     * @Bean 是什么作用？你能说出来多少？
     */

    @Bean
    public JobDetail myJob(){
        //构建一个任务对象
        return JobBuilder.newJob(MyJob.class).storeDurably().withIdentity("myjob").build();
    }
    /**
     * 创建Trigger关联Job任务
     */
    @Bean
    public Trigger trigger(){
        //设置任务的执行方式
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(10).repeatForever();
        return TriggerBuilder.newTrigger().
                forJob(myJob()).
                        withIdentity("myTriger").
                        //forjob你要执行的任务，调用上边方法即可
                        withSchedule(scheduleBuilder).
                        //关联schedule对象
                        //立即开始，默认的方式
                        startNow().
                        //构建触发器
                        build();
    }


}
