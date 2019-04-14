package com.threebody.tbmall.base;

import com.threebody.tbmall.constant.emun.ResponseEnum;

public class ApiResult<T> {
    private Integer code;
    private String message;
    private T data;

    private ApiResult(Integer code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private ApiResult(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public static ApiResult success(){
        return new ApiResult(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMessage());
    }

    public static ApiResult success(Object data){
        return new ApiResult(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMessage(), data);
    }

    public static ApiResult fail(){
        return new ApiResult(ResponseEnum.FAILED.getCode(), ResponseEnum.FAILED.getMessage());
    }

    public static ApiResult fail(String message){
        return new ApiResult(ResponseEnum.FAILED.getCode(), message);
    }

    public ApiResult fail(Integer code, String message){
        return new ApiResult(code, message);
    }
}
