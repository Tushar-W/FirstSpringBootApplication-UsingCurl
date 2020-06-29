package com.bl.springboot.services;

import com.bl.springboot.model.Greeting;
import com.bl.springboot.model.User;

import java.util.List;

public interface IGreetingService {
    Greeting addGreeting(User user);
    List<Greeting> findAllGreetings();
    Greeting findGreetingById(long id);
    Greeting updateGreetingById(long id, User user);
}
