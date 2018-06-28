package com.house.exception;

public class HouseException extends RuntimeException {

    private Integer code;
    private String message;

    public HouseException(Integer code,String message){
       this.code = code;
       this.message = message;
    }

    public HouseException() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
