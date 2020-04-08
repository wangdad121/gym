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
@TableName(value = "Gym_cab_info")
public class GymCabInfo {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "cab_info_number")
    private  Integer cabInfoNumber;
    @TableField(value = "cab_info_price")
    private  Integer cabInfoPrice;
    @TableField(value = "cab_info_duration")
    private  Integer cabInfoDuration;
    @TableField(value = "cab_info_create_time")
    private  Date cabInfoCreateTime;
    @TableField(value = "cab_info_update_time")
    private Date cabInfoUpdateTime;
    @TableField(value = "cab_info_member")
    private  Integer cabInfoMember;
    @TableField(value = "cab_info_status")
    private  Integer cabInfoStatus;
    @TableField(value = "cab_cabinet_id")
    private  Integer cabCabinetId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCabInfoNumber() {
        return cabInfoNumber;
    }

    public void setCabInfoNumber(Integer cabInfoNumber) {
        this.cabInfoNumber = cabInfoNumber;
    }

    public Integer getCabInfoPrice() {
        return cabInfoPrice;
    }

    public void setCabInfoPrice(Integer cabInfoPrice) {
        this.cabInfoPrice = cabInfoPrice;
    }

    public Integer getCabInfoDuration() {
        return cabInfoDuration;
    }

    public void setCabInfoDuration(Integer cabInfoDuration) {
        this.cabInfoDuration = cabInfoDuration;
    }

    public Date getCabInfoCreateTime() {
        return cabInfoCreateTime;
    }

    public void setCabInfoCreateTime(Date cabInfoCreateTime) {
        this.cabInfoCreateTime = cabInfoCreateTime;
    }

    public Date getCabInfoUpdateTime() {
        return cabInfoUpdateTime;
    }

    public void setCabInfoUpdateTime(Date cabInfoUpdateTime) {
        this.cabInfoUpdateTime = cabInfoUpdateTime;
    }

    public Integer getCabInfoMember() {
        return cabInfoMember;
    }

    public void setCabInfoMember(Integer cabInfoMember) {
        this.cabInfoMember = cabInfoMember;
    }

    public Integer getCabInfoStatus() {
        return cabInfoStatus;
    }

    public void setCabInfoStatus(Integer cabInfoStatus) {
        this.cabInfoStatus = cabInfoStatus;
    }

    public Integer getCabCabinetId() {
        return cabCabinetId;
    }

    public void setCabCabinetId(Integer cabCabinetId) {
        this.cabCabinetId = cabCabinetId;
    }
}
