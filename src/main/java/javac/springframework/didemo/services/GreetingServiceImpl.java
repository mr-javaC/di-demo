package javac.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_JAVAC = "Hello javaC!!! - Original";

    @Override
    public String sayGreeting() {
        return HELLO_JAVAC;
    }
}
