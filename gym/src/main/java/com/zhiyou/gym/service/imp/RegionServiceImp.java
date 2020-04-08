package com.zhiyou.gym.service.imp;

import com.zhiyou.gym.entity.ResponseData;
import com.zhiyou.gym.mapper.RegionMapper;
import com.zhiyou.gym.pojo.Region;
import com.zhiyou.gym.service.RegionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RegionServiceImp implements RegionService {
    @Autowired
    private RegionMapper regionMapper;
    @Override
    public void insertRegion(Region region) {
        Date date = new Date();
        region.setRegionNumber(Integer.valueOf((int) date.getTime()));
        Date time1= new java.sql.Date(new Date().getTime());
        region.setRegionTime((java.sql.Date) time1);
        regionMapper.insert(region);
    }

    @Override
    public ResponseData selectAllRegion() {
        ResponseData<Object> a = new ResponseData<>();
        a.setData(regionMapper.selectList(null));
        return a;
    }

    @Override
    public void deleteById(Integer id) {
        regionMapper.deleteById(id);
    }
}
