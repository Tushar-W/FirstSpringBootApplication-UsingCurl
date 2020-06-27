package com.bl.springboot.services;

import com.bl.springboot.model.Greeting;
import com.bl.springboot.model.User;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
}
