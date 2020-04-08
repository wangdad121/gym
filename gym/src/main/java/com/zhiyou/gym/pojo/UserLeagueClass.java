package com.zhiyou.gym.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@TableName(value = "user_league_class")
public class UserLeagueClass {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "user_id")
    private  Integer userId;
    @TableField(value = "league_class_id")
    private  Integer leagueClassId;

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

    public Integer getLeagueClassId() {
        return leagueClassId;
    }

    public void setLeagueClassId(Integer leagueClassId) {
        this.leagueClassId = leagueClassId;
    }
}
