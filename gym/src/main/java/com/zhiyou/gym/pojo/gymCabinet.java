package com.zhiyou.gym.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@TableName(value = "gym_cabinet")
public class gymCabinet {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "cab_number")
    private  Integer cabNumber;
    @TableField(value = "cab_capaity")
    private  Integer cabCapaity;
    @TableField(value = "cab_status")
    private  Integer cabStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCabNumber() {
        return cabNumber;
    }

    public void setCabNumber(Integer cabNumber) {
        this.cabNumber = cabNumber;
    }

    public Integer getCabCapaity() {
        return cabCapaity;
    }

    public void setCabCapaity(Integer cabCapaity) {
        this.cabCapaity = cabCapaity;
    }

    public Integer getCabStatus() {
        return cabStatus;
    }

    public void setCabStatus(Integer cabStatus) {
        this.cabStatus = cabStatus;
    }
}
