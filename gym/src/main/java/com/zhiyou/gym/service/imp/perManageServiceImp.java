package com.zhiyou.gym.service.imp;

import com.zhiyou.gym.mapper.perManageMapper;
import com.zhiyou.gym.pojo.perManage;
import com.zhiyou.gym.service.perManageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class perManageServiceImp implements perManageService {
    @Autowired
    private com.zhiyou.gym.mapper.perManageMapper perManageMapper;
    @Override
    public List<perManage> selectAll() {
        return perManageMapper.selectList(null);
    }
}
