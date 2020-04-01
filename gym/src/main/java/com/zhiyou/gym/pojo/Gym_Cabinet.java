package com.zhiyou.gym.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@TableName("gym_cabinet")
public class Gym_Cabinet {
    @TableId(value = "cab_id", type = IdType.AUTO)
    private int cabid;
    @TableField(value = "cab_number")
    private int cabnumber;
    @TableField(value = "cab_capacity")
    private int cabcapacity;
    @TableField(value = "cab_status")
    private int cabstatus;

    public int getCabid() {
        return cabid;
    }

    public void setCabid(int cabid) {
        this.cabid = cabid;
    }

    public int getCabnumber() {
        return cabnumber;
    }

    public void setCabnumber(int cabnumber) {
        this.cabnumber = cabnumber;
    }

    public int getCabcapacity() {
        return cabcapacity;
    }

    public void setCabcapacity(int cabcapacity) {
        this.cabcapacity = cabcapacity;
    }

    public int getCabstatus() {
        return cabstatus;
    }

    public void setCabstatus(int cabstatus) {
        this.cabstatus = cabstatus;
    }
}
