package com.threebody.tbmall.constant.emun;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public enum ResponseEnum {
    SUCCESS(200,"成功"),
    FAILED(500,"失败");

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private ResponseEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
