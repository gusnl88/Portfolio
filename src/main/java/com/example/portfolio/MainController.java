package com.example.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @GetMapping("/main.do")
    public String fistPage(){
       return "main/main";
    }
    @GetMapping("/index.do")
    public String index(){
        return "index";
    }
    @GetMapping("profile.do")
    public String profile(){
        return "profile";
    }
}
