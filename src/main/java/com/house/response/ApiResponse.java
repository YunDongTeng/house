package com.house.response;

public class ApiResponse {

    private Integer code;
    private String message;
    private Object data;

    public static ApiResponse success(Object data){
        return new ApiResponse(Status.SUCCESS.getCode(),Status.SUCCESS.getMessage(),data);
    }

    public static ApiResponse message(Integer code,String message){
        return new ApiResponse(code,message,null);
    }

    public static ApiResponse error(Integer code,String message) {
        return new ApiResponse(code,message,null);
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ApiResponse(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
