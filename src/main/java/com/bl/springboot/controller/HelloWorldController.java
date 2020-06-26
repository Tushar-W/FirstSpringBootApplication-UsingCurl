package com.bl.springboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(value = {"", "/","/home"})
    public String sayHello(){
        return "Hello World...!";
    }
}