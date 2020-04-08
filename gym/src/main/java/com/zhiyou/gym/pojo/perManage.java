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
@TableName(value = "per_manage")
public class perManage {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "pre_manage_number")
    private  Integer preManageNumber;
    @TableField(value = "personal_trainer_id")
    private  Integer personalTrainerId;
    @TableField(value = "user_id")
    private  Integer userId;
    @TableField(value = "personal_trainer_type")
    private  String personalTrainerType;
    @TableField(value = "personal_trainer_money")
    private  Integer personalTrainerMoney;
    @TableField(value = "personal_trainer_time")
    private Date personalTrainerTime;
    @TableField(value = "personal_trainer_static")
    private  String personalTrainerStatic;
    @TableField(value = "personal_trainer_speak")
    private  String personalTrainerSpeak;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPreManageNumber() {
        return preManageNumber;
    }

    public void setPreManageNumber(Integer preManageNumber) {
        this.preManageNumber = preManageNumber;
    }

    public Integer getPersonalTrainerId() {
        return personalTrainerId;
    }

    public void setPersonalTrainerId(Integer personalTrainerId) {
        this.personalTrainerId = personalTrainerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPersonalTrainerType() {
        return personalTrainerType;
    }

    public void setPersonalTrainerType(String personalTrainerType) {
        this.personalTrainerType = personalTrainerType;
    }

    public Integer getPersonalTrainerMoney() {
        return personalTrainerMoney;
    }

    public void setPersonalTrainerMoney(Integer personalTrainerMoney) {
        this.personalTrainerMoney = personalTrainerMoney;
    }

    public Date getPersonalTrainerTime() {
        return personalTrainerTime;
    }

    public void setPersonalTrainerTime(Date personalTrainerTime) {
        this.personalTrainerTime = personalTrainerTime;
    }

    public String getPersonalTrainerStatic() {
        return personalTrainerStatic;
    }

    public void setPersonalTrainerStatic(String personalTrainerStatic) {
        this.personalTrainerStatic = personalTrainerStatic;
    }

    public String getPersonalTrainerSpeak() {
        return personalTrainerSpeak;
    }

    public void setPersonalTrainerSpeak(String personalTrainerSpeak) {
        this.personalTrainerSpeak = personalTrainerSpeak;
    }
}
