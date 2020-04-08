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
@TableName(value = "paike")
public class Paike {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "paike_number")
    private  Integer paikeNumber;
    @TableField(value = "paike_name")
    private  String paikeName;
    @TableField(value = "paike_biaoqian")
    private  String paikeBiaoqian;
    @TableField(value = "paike_start_time")
    private  Date paikeStartTime;
    @TableField(value = "paike_end_time")
    private Date paikeEndTime;
    @TableField(value = "paike_static")
    private  String paikeStatic;
    @TableField(value = "paike_shuju_static")
    private  Integer paikeShujuStatic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPaikeNumber() {
        return paikeNumber;
    }

    public void setPaikeNumber(Integer paikeNumber) {
        this.paikeNumber = paikeNumber;
    }

    public String getPaikeName() {
        return paikeName;
    }

    public void setPaikeName(String paikeName) {
        this.paikeName = paikeName;
    }

    public String getPaikeBiaoqian() {
        return paikeBiaoqian;
    }

    public void setPaikeBiaoqian(String paikeBiaoqian) {
        this.paikeBiaoqian = paikeBiaoqian;
    }

    public Date getPaikeStartTime() {
        return paikeStartTime;
    }

    public void setPaikeStartTime(Date paikeStartTime) {
        this.paikeStartTime = paikeStartTime;
    }

    public Date getPaikeEndTime() {
        return paikeEndTime;
    }

    public void setPaikeEndTime(Date paikeEndTime) {
        this.paikeEndTime = paikeEndTime;
    }

    public String getPaikeStatic() {
        return paikeStatic;
    }

    public void setPaikeStatic(String paikeStatic) {
        this.paikeStatic = paikeStatic;
    }

    public Integer getPaikeShujuStatic() {
        return paikeShujuStatic;
    }

    public void setPaikeShujuStatic(Integer paikeShujuStatic) {
        this.paikeShujuStatic = paikeShujuStatic;
    }
}
