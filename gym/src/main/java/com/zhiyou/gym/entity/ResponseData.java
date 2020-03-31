package com.zhiyou.gym.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResponseData<T> {
  private T data;
  private int code;
  private  String msg;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
