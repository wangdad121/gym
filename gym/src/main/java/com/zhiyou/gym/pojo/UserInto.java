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
@TableName(value = "user_into")
public class UserInto {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "user_id")
    private  Integer userId;
    @TableField(value = "into_number")
    private  Integer intoNumber;
    @TableField(value = "into_time")
    private Date intoTime;
    @TableField(value = "goto_time")
    private  Date gotoTime;
    @TableField(value = "into_static")
    private  String intoStatic;

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

    public Integer getIntoNumber() {
        return intoNumber;
    }

    public void setIntoNumber(Integer intoNumber) {
        this.intoNumber = intoNumber;
    }

    public Date getIntoTime() {
        return intoTime;
    }

    public void setIntoTime(Date intoTime) {
        this.intoTime = intoTime;
    }

    public Date getGotoTime() {
        return gotoTime;
    }

    public void setGotoTime(Date gotoTime) {
        this.gotoTime = gotoTime;
    }

    public String getIntoStatic() {
        return intoStatic;
    }

    public void setIntoStatic(String intoStatic) {
        this.intoStatic = intoStatic;
    }
}
