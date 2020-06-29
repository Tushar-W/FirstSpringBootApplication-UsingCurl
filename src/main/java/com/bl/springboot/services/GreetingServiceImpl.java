package com.bl.springboot.services;

import com.bl.springboot.model.Greeting;
import com.bl.springboot.model.User;
import com.bl.springboot.repository.IGreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServiceImpl implements IGreetingService {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private IGreetingRepository greetingRepository;

    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template, (user.getFirstName().isEmpty()) ? "Hello World" : user.getFirstName()+" "+user.getLastName());
        return greetingRepository.save(new Greeting(counter.incrementAndGet(), message));
    }

    @Override
    public List<Greeting> findAllGreetings() {
        return greetingRepository.findAll();
    }

    @Override
    public Greeting findGreetingById(long id) {
        return greetingRepository.findById(id).get();
    }

    @Override
    public Greeting updateGreetingById(long id, User user) {
        Greeting greeting = findGreetingById(id);
        greeting.setName("Hello " + user.getFirstName() + " " + user.getLastName());
        return greetingRepository.save(greeting);
    }
}
