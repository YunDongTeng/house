package com.house.web;


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

    @GetMapping("/index")
    public String index(){
        return "index";
    }

}
