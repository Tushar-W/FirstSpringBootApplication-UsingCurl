package com.bl.springboot.controller;

import com.bl.springboot.model.Greeting;
import com.bl.springboot.model.User;
import com.bl.springboot.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;

    @GetMapping("/getallgreeting")
    public List<Greeting> getAllGreeting(){
        return greetingService.findAllGreetings();
    }

    @GetMapping ("/getgreetingbyid")
    public Greeting getGreetingById(@RequestParam (value = "id") Long id) {
        return greetingService.findGreetingById(id);
    }

    @PostMapping("/addgreeting")
    public Greeting greeting(@RequestParam(value = "firstName") String firstName,
                             @RequestParam(value = "lastName") String lastName){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);
    }

    @PutMapping ("/updategreeting/{id}")
    public Greeting updateGreeting(@PathVariable Long id,
                                   @RequestParam (value = "firstName") String firstName,
                                   @RequestParam (value = "lastName") String lastName) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.updateGreetingById(id, user);
    }

    @DeleteMapping("/deletegreeting/{id}")
    public Greeting deleteUserById(@PathVariable Long id){
        return greetingService.deleteGreetingById(id);
    }
}
