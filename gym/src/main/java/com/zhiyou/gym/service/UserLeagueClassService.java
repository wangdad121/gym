package com.zhiyou.gym.service;

import com.zhiyou.gym.pojo.UserLeagueClass;


import java.util.List;

public interface UserLeagueClassService {
    //通过用户id查询他报了哪些团课
    List<UserLeagueClass> selectAllByUserId(Integer id);
    //用户删除预约团课
    void deleteByUserId(Integer id);
    Integer selectAllBylIdAndUId(Integer leagueid, Integer userid);
    void insert(UserLeagueClass userLeagueClass);

}
