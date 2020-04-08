package com.zhiyou.gym.service.imp;

import com.zhiyou.gym.mapper.PaikeMapper;
import com.zhiyou.gym.pojo.Paike;
import com.zhiyou.gym.service.PaikeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaikeServiceImp implements PaikeService {
    @Autowired
    private PaikeMapper paikeMapper;
    @Override
    public List<Paike> selectAllPaike() {
        return paikeMapper.selectList(null);
    }

    @Override
    public void deletePaikeById(Integer id) {
        paikeMapper.deleteById(id);
    }

    @Override
    public void insertPaike(Paike paike) {
        paikeMapper.insert(paike);
    }

    @Override
    public void updatePaike(Paike paike) {
        paikeMapper.updateById(paike);
    }
}
