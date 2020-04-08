package com.zhiyou.gym.service;

import com.zhiyou.gym.pojo.Paike;

import java.util.List;

public interface PaikeService {
    //查询所有排课信息
    List<Paike> selectAllPaike();
    //删除排课
    void deletePaikeById(Integer id);
    //添加排课
    void insertPaike(Paike paike);
    //修改排课
    void updatePaike(Paike paike);
}
