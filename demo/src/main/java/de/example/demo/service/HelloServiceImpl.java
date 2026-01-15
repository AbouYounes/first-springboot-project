package de.example.demo.service;

import org.springframework.stereotype.Service;

// @Service markiert diese Klasse als Business-Service
// Spring erstellt automatisch ein Bean
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "Hello SpringBoot!";
    }
}
