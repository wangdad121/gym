package com.zhiyou.gym.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.sql.Date;

@Data
@ToString
@TableName(value = "region")
public class Region {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "region_number")
    private  Integer regionNumber;
    @TableField(value = "region_time")
    private Date regionTime;
    @TableField(value = "region_id")
    private  Integer regionId;
    @TableField(value = "region_remark")
    private  String regionRemark;
    @TableField(value = "region_static")
    private  String regionStatic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegionNumber() {
        return regionNumber;
    }

    public void setRegionNumber(Integer regionNumber) {
        this.regionNumber = regionNumber;
    }

    public Date getRegionTime() {
        return regionTime;
    }

    public void setRegionTime(Date regionTime) {
        this.regionTime = regionTime;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getRegionRemark() {
        return regionRemark;
    }

    public void setRegionRemark(String regionRemark) {
        this.regionRemark = regionRemark;
    }

    public String getRegionStatic() {
        return regionStatic;
    }

    public void setRegionStatic(String regionStatic) {
        this.regionStatic = regionStatic;
    }
}
