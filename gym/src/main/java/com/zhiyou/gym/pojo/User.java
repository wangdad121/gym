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
@TableName(value = "user")
public class User {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "name")
    private  String name;
    @TableField(value = "sex")
    private  String sex;
    @TableField(value = "phone")
    private  Integer phone;
    @TableField(value = "time")
    private Date time;
    @TableField(value = "speak")
    private  String speak;
    @TableField(value = "Occupation")
    private  String Occupation;
    @TableField(value = "hobbit")
    private  String hobbit;
    @TableField(value = "address")
    private  String address;
    @TableField(value = "user_static")
    private  String UserStatic;
    @TableField(value = "`user_account`")
    private  String UserAccount;
    @TableField(value = "`user_password`")
    private  String UserPassword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    public String getHobbit() {
        return hobbit;
    }

    public void setHobbit(String hobbit) {
        this.hobbit = hobbit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserStatic() {
        return UserStatic;
    }

    public void setUserStatic(String userStatic) {
        UserStatic = userStatic;
    }

    public String getUserAccount() {
        return UserAccount;
    }

    public void setUserAccount(String userAccount) {
        UserAccount = userAccount;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }
}
