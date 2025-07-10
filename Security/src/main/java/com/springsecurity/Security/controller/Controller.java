package com.springsecurity.Security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hdfc")
public class Controller {

    @GetMapping("/home")
    public String homePage()
    {
        return "Home page";
    }

    @GetMapping("/getBalance")
    public String getBalance()
    {
        return "10000K";
    }
}
