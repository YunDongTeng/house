package com.house.response;

public enum Status {

    SUCCESS(200,"success"),
    BAD_REQUEST(400,"bad request"),
    SEVER_ERROR(500,"server error"),
    NOT_LOGIN(500501,"user not login")
    ;

    private Integer code;
    private String message;


    Status(Integer code, String message) {
        this.code = code;
        this.message = message;
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
}
