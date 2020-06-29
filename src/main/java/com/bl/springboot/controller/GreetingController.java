package com.bl.springboot.controller;

import com.bl.springboot.model.Greeting;
import com.bl.springboot.model.User;
import com.bl.springboot.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;

    @GetMapping("/getgreeting")
    public Greeting greeting(@RequestParam(value = "firstName") String firstName,
                             @RequestParam(value = "lastName") String lastName){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);
    }

    @GetMapping("/getallgreeting")
    public List<Greeting> getAllGreeting(){
        return greetingService.findAllGreetings();
    }
}
