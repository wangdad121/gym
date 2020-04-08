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
@TableName(value = "user_deposit")
public class UserDeposit {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField(value = "user_deposit_number")
    private Integer userDepositNumber;
    @TableField(value = "user_deposit_id")
    private Integer userDepositId;
    @TableField(value = "user_deposit_money")
    private Integer userDepositMoney;
    @TableField(value = "user_deposit_time")
    private Date userDepositTime;
    @TableField(value = "user_id")
    private Integer userId;
    @TableField(value = "user_deposit_static")
    private String userDepositStatic;
    @TableField(value = "`name`")
    private  String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserDepositNumber() {
        return userDepositNumber;
    }

    public void setUserDepositNumber(Integer userDepositNumber) {
        this.userDepositNumber = userDepositNumber;
    }

    public Integer getUserDepositId() {
        return userDepositId;
    }

    public void setUserDepositId(Integer userDepositId) {
        this.userDepositId = userDepositId;
    }

    public Integer getUserDepositMoney() {
        return userDepositMoney;
    }

    public void setUserDepositMoney(Integer userDepositMoney) {
        this.userDepositMoney = userDepositMoney;
    }

    public Date getUserDepositTime() {
        return userDepositTime;
    }

    public void setUserDepositTime(Date userDepositTime) {
        this.userDepositTime = userDepositTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserDepositStatic() {
        return userDepositStatic;
    }

    public void setUserDepositStatic(String userDepositStatic) {
        this.userDepositStatic = userDepositStatic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
