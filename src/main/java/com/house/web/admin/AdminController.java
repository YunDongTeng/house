package com.house.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @GetMapping("/admin/login")
    public String login(){
        return "admin/login";
    }

    @GetMapping("/admin/center")
    public String center(){
        return "admin/center";
    }
    @GetMapping("/admin/welcome")
    public String welcome(){
        return "admin/welcome";
    }
}
