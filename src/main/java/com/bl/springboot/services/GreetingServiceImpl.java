package com.bl.springboot.services;

import com.bl.springboot.model.Greeting;
import com.bl.springboot.model.User;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements IGreetingService{
    @Override
    public Greeting addGreeting(User user) {
        return null;
    }

    @Override
    public Greeting getGreetingById(long id) {
        return null;
    }
}
