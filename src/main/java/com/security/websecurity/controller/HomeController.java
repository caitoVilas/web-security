package com.security.websecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/form-login")
    public String formLogin(){
        return "form-login";
    }

    @GetMapping("form-register")
    public String formRegister(){
        return "form-register";
    }
}
