package com.bl.springboot.repository;

import com.bl.springboot.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGreetingRepository extends JpaRepository<Greeting, Long> {
}
