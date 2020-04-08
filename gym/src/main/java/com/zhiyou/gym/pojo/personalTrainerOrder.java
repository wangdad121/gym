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
@TableName(value = "personal_trainer_order")
public class personalTrainerOrder {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "user_id")
    private  Integer userId;
    @TableField(value = "personal_trainer_id")
    private  Integer personalTrainerId;
    @TableField(value = "personal_trainer_order_start_time")
    private String personalTrainerOrderStartTime;
    @TableField(value = "personal_trainer_order_end_time")
    private  String personalTrainerOrderEndTime;
    @TableField(value = "shuju")
    private  Integer shuju;

    public Integer getShuju() {
        return shuju;
    }

    public void setShuju(Integer shuju) {
        this.shuju = shuju;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPersonalTrainerId() {
        return personalTrainerId;
    }

    public void setPersonalTrainerId(Integer personalTrainerId) {
        this.personalTrainerId = personalTrainerId;
    }

    public String getPersonalTrainerOrderStartTime() {
        return personalTrainerOrderStartTime;
    }

    public void setPersonalTrainerOrderStartTime(String personalTrainerOrderStartTime) {
        this.personalTrainerOrderStartTime = personalTrainerOrderStartTime;
    }

    public String getPersonalTrainerOrderEndTime() {
        return personalTrainerOrderEndTime;
    }

    public void setPersonalTrainerOrderEndTime(String personalTrainerOrderEndTime) {
        this.personalTrainerOrderEndTime = personalTrainerOrderEndTime;
    }
}
