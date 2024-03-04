package guru.springframework.spring5webapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{


    @Override
    public String sayHello() {
        return "Hello from Base service!!! ";
    }
}
