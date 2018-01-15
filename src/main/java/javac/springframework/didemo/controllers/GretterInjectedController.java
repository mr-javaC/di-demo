package javac.springframework.didemo.controllers;

import javac.springframework.didemo.services.GreetingService;
import javac.springframework.didemo.services.GreetingServiceImpl;

public class GretterInjectedController {

    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
