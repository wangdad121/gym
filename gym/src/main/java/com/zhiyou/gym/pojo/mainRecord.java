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
@TableName(value = "main_record")
public class mainRecord {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "main_record_number")
    private  Integer mainRecordNumber;
    @TableField(value = "equipment_on")
    private  String equipmentOn;
    @TableField(value = "equipment_name")
    private  String equipmentName;
    @TableField(value = "equipment_bianhao")
    private  String equipmentBianhao;
    @TableField(value = "equipment_message")
    private  String equipmentMessage;
    @TableField(value = "main_record_time")
    private Date mainRecordTime;
    @TableField(value = "main_record_money")
    private  Integer mainRecordMoney;
    @TableField(value = "record_becouse")
    private  String recordBecouse;
    @TableField(value = "main_people_name")
    private  String mainPeopleName;
    @TableField(value = "main_people_phone")
    private  Integer mainPeoplePhone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMainRecordNumber() {
        return mainRecordNumber;
    }

    public void setMainRecordNumber(Integer mainRecordNumber) {
        this.mainRecordNumber = mainRecordNumber;
    }

    public String getEquipmentOn() {
        return equipmentOn;
    }

    public void setEquipmentOn(String equipmentOn) {
        this.equipmentOn = equipmentOn;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getEquipmentBianhao() {
        return equipmentBianhao;
    }

    public void setEquipmentBianhao(String equipmentBianhao) {
        this.equipmentBianhao = equipmentBianhao;
    }

    public String getEquipmentMessage() {
        return equipmentMessage;
    }

    public void setEquipmentMessage(String equipmentMessage) {
        this.equipmentMessage = equipmentMessage;
    }

    public Date getMainRecordTime() {
        return mainRecordTime;
    }

    public void setMainRecordTime(Date mainRecordTime) {
        this.mainRecordTime = mainRecordTime;
    }

    public Integer getMainRecordMoney() {
        return mainRecordMoney;
    }

    public void setMainRecordMoney(Integer mainRecordMoney) {
        this.mainRecordMoney = mainRecordMoney;
    }

    public String getRecordBecouse() {
        return recordBecouse;
    }

    public void setRecordBecouse(String recordBecouse) {
        this.recordBecouse = recordBecouse;
    }

    public String getMainPeopleName() {
        return mainPeopleName;
    }

    public void setMainPeopleName(String mainPeopleName) {
        this.mainPeopleName = mainPeopleName;
    }

    public Integer getMainPeoplePhone() {
        return mainPeoplePhone;
    }

    public void setMainPeoplePhone(Integer mainPeoplePhone) {
        this.mainPeoplePhone = mainPeoplePhone;
    }
}
