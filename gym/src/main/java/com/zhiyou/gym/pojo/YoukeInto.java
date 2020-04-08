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
@TableName(value = "youke_into")
public class YoukeInto {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "youke_number")
    private  Integer youkeNumber;
    @TableField(value = "youke_phone")
    private  Integer youkePhone;
    @TableField(value = "youke_sex")
    private  String youkeSex;
    @TableField(value = "youke_time")
    private Date youkeTime;
    @TableField(value = "youke_beizhu")
    private  String youkeBeizhu;
    @TableField(value = "youke_zhiye")
    private  String youkeZhiye;
    @TableField(value = "youke_hobbit")
    private  String youkeHobbit;
    @TableField(value = "youke_adress")
    private  String youkeAdress;
    @TableField(value = "youke_static")
    private  String youkeStatic;
    public String getYoukeAdress() {
        return youkeAdress;
    }

    public void setYoukeAdress(String youkeAdress) {
        this.youkeAdress = youkeAdress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYoukeNumber() {
        return youkeNumber;
    }

    public void setYoukeNumber(Integer youkeNumber) {
        this.youkeNumber = youkeNumber;
    }

    public Integer getYoukePhone() {
        return youkePhone;
    }

    public void setYoukePhone(Integer youkePhone) {
        this.youkePhone = youkePhone;
    }

    public String getYoukeSex() {
        return youkeSex;
    }

    public void setYoukeSex(String youkeSex) {
        this.youkeSex = youkeSex;
    }

    public Date getYoukeTime() {
        return youkeTime;
    }

    public void setYoukeTime(Date youkeTime) {
        this.youkeTime = youkeTime;
    }

    public String getYoukeBeizhu() {
        return youkeBeizhu;
    }

    public void setYoukeBeizhu(String youkeBeizhu) {
        this.youkeBeizhu = youkeBeizhu;
    }

    public String getYoukeZhiye() {
        return youkeZhiye;
    }

    public void setYoukeZhiye(String youkeZhiye) {
        this.youkeZhiye = youkeZhiye;
    }

    public String getYoukeHobbit() {
        return youkeHobbit;
    }

    public void setYoukeHobbit(String youkeHobbit) {
        this.youkeHobbit = youkeHobbit;
    }

    public String getYoukeStatic() {
        return youkeStatic;
    }

    public void setYoukeStatic(String youkeStatic) {
        this.youkeStatic = youkeStatic;
    }
}
