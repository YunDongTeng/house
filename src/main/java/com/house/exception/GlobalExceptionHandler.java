package com.house.exception;


import com.house.response.ApiResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理类
 */
@ControllerAdvice
@Component
public class GlobalExceptionHandler {

    /**
     * 接口内部异常处理
     * @param houseException
     * @return
     */
    @ExceptionHandler(HouseException.class)
    @ResponseBody
    public ApiResponse handleHouseException(HouseException houseException){
        return ApiResponse.error(houseException.getCode(),houseException.getMessage());
    }


}
