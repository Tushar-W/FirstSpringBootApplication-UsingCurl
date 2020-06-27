package com.bl.springboot.controller;

import com.bl.springboot.model.Greeting;
import com.bl.springboot.model.User;
import com.bl.springboot.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;

    @GetMapping("")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        User user = new User();
        user.setFirstName(name);
        return greetingService.addGreeting(user);
    }
}
