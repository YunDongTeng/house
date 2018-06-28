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
}
