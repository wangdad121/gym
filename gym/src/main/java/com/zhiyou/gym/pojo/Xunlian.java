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
@TableName(value = "xunlian")
public class Xunlian {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "xunlian_number")
    private  Integer xunlianNumber;
    @TableField(value = "user_id")
    private  Integer userId;
    @TableField(value = "applian_name")
    private  String applianName;
    @TableField(value = "xunlian_time")
    private Integer xunlianTime;
    @TableField(value = "user_name")
    private  String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getXunlianNumber() {
        return xunlianNumber;
    }

    public void setXunlianNumber(Integer xunlianNumber) {
        this.xunlianNumber = xunlianNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getApplianName() {
        return applianName;
    }

    public void setApplianName(String applianName) {
        this.applianName = applianName;
    }

    public Integer getXunlianTime() {
        return xunlianTime;
    }

    public void setXunlianTime(Integer xunlianTime) {
        this.xunlianTime = xunlianTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
