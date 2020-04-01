package com.zhiyou.gym.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import java.util.Date;
@Data
@ToString
@TableName("gym_cab_info")
public class Gym_Cab_Info {
    @TableId(value = "cab_info_id", type = IdType.AUTO)
    private Integer cabinfoid;
    @TableField(value = "cab_info_number")
    private Integer cabinfonumber;
    @TableField(value = "cab_info_price")
    private Integer cabinfoprice;
    @TableField(value = "cab_info_duration")
    private Integer cabinfoduration;
    @TableField(value = "cab_info_create_time")
    private  Date cabinfocreatetime;
    @TableField(value = "cab_info_update_time")
    private Date cabinfoupdatetime;
    @TableField(value = "cab_info_member")
    private Integer cabinfomember;
    @TableField(value = "cab_info_status")
    private Integer cabinfostatus;

    public Integer getCabinfoid() {
        return cabinfoid;
    }

    public void setCabinfoid(Integer cabinfoid) {
        this.cabinfoid = cabinfoid;
    }

    public Integer getCabinfonumber() {
        return cabinfonumber;
    }

    public void setCabinfonumber(Integer cabinfonumber) {
        this.cabinfonumber = cabinfonumber;
    }

    public Integer getCabinfoprice() {
        return cabinfoprice;
    }

    public void setCabinfoprice(Integer cabinfoprice) {
        this.cabinfoprice = cabinfoprice;
    }

    public Integer getCabinfoduration() {
        return cabinfoduration;
    }

    public void setCabinfoduration(Integer cabinfoduration) {
        this.cabinfoduration = cabinfoduration;
    }

    public Date getCabinfocreatetime() {
        return cabinfocreatetime;
    }

    public void setCabinfocreatetime(Date cabinfocreatetime) {
        this.cabinfocreatetime = cabinfocreatetime;
    }

    public Date getCabinfoupdatetime() {
        return cabinfoupdatetime;
    }

    public void setCabinfoupdatetime(Date cabinfoupdatetime) {
        this.cabinfoupdatetime = cabinfoupdatetime;
    }

    public Integer getCabinfomember() {
        return cabinfomember;
    }

    public void setCabinfomember(Integer cabinfomember) {
        this.cabinfomember = cabinfomember;
    }

    public Integer getCabinfostatus() {
        return cabinfostatus;
    }

    public void setCabinfostatus(Integer cabinfostatus) {
        this.cabinfostatus = cabinfostatus;
    }
}
