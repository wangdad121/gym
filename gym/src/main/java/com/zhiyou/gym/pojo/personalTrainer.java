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
@TableName(value = "personal_trainer")
public class personalTrainer {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "personal_trainer_number")
    private  Integer personalTrainerNumber;
    @TableField(value = "personal_trainer_name")
    private  String personalTrainerName;
    @TableField(value = "personal_trainer_age")
    private  Integer personalTrainerAge;
    @TableField(value = "personal_trainer_hobbit")
    private  String personalTrainerHobbit;
    @TableField(value = "personal_trainer_sex")
    private  String personalTrainerSex;
    @TableField(value = "personal_trainer_spreak")
    private  String personalTrainerSpreak;
    @TableField(value = "personal_trainer_priture")
    private  String personalTrainerPriture;
    @TableField(value = "personal_trainer_time")
    private Date personalTrainerTime;
    @TableField(value = "personal_trainer_static")
    private  String personalTrainerStatic;
    @TableField(value = "personal_traniner_account")
    private  String personalTraninerAccount;
    @TableField(value = "personal_traniner_password")
    private  String personalTraninerPassword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPersonalTrainerNumber() {
        return personalTrainerNumber;
    }

    public void setPersonalTrainerNumber(Integer personalTrainerNumber) {
        this.personalTrainerNumber = personalTrainerNumber;
    }

    public String getPersonalTrainerName() {
        return personalTrainerName;
    }

    public void setPersonalTrainerName(String personalTrainerName) {
        this.personalTrainerName = personalTrainerName;
    }

    public Integer getPersonalTrainerAge() {
        return personalTrainerAge;
    }

    public void setPersonalTrainerAge(Integer personalTrainerAge) {
        this.personalTrainerAge = personalTrainerAge;
    }

    public String getPersonalTrainerHobbit() {
        return personalTrainerHobbit;
    }

    public void setPersonalTrainerHobbit(String personalTrainerHobbit) {
        this.personalTrainerHobbit = personalTrainerHobbit;
    }

    public String getPersonalTrainerSex() {
        return personalTrainerSex;
    }

    public void setPersonalTrainerSex(String personalTrainerSex) {
        this.personalTrainerSex = personalTrainerSex;
    }

    public String getPersonalTrainerSpreak() {
        return personalTrainerSpreak;
    }

    public void setPersonalTrainerSpreak(String personalTrainerSpreak) {
        this.personalTrainerSpreak = personalTrainerSpreak;
    }

    public String getPersonalTrainerPriture() {
        return personalTrainerPriture;
    }

    public void setPersonalTrainerPriture(String personalTrainerPriture) {
        this.personalTrainerPriture = personalTrainerPriture;
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

    public String getPersonalTraninerAccount() {
        return personalTraninerAccount;
    }

    public void setPersonalTraninerAccount(String personalTraninerAccount) {
        this.personalTraninerAccount = personalTraninerAccount;
    }

    public String getPersonalTraninerPassword() {
        return personalTraninerPassword;
    }

    public void setPersonalTraninerPassword(String personalTraninerPassword) {
        this.personalTraninerPassword = personalTraninerPassword;
    }
}
