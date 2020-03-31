package com.zhiyou.gym.entity;

public enum ResponseCode {
   SUCCESS(200,"成功"),
    ERROR_IN_SERVER(500,"服务器错误"),
    NOT_LOGIN(400,"用户未登录"),
    ACCOUNT_ERROR(121,"账号或者密码不能为空"),
    ERROR_LOGIN(000,"账号或密码错误");
    private final int code;
    private final String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
