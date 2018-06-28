package com.house.web;


import com.house.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/house")
public class HouseController {


    @GetMapping("/list")
    public String list(){
        return "list...";
    }

    @GetMapping("/message")
    public ApiResponse index(){
        return ApiResponse.message(200,"请求成功");
    }

}
