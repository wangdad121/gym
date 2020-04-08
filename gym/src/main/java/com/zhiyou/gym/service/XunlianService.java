package com.zhiyou.gym.service;

import com.zhiyou.gym.pojo.Xunlian;


import java.util.List;

public interface XunlianService {
    //添加会员训练记录
    void insertXunlian(Xunlian xunlian);
    //查询训练记录
    List<Xunlian> selectAll();
    //删除训练记录
    void  deleteById(Integer id);
    //通过id查询
    List<Xunlian> selectById(Integer id);
}
