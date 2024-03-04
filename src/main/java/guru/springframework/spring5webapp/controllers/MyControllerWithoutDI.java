package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.service.GreetingService;
import guru.springframework.spring5webapp.service.GreetingServiceImpl;
import org.springframework.stereotype.Controller;


public class MyControllerWithoutDI {
    //we are not injecting any kind of dependency, manually using spring (without DI)
    private GreetingService greetingService;

    public MyControllerWithoutDI() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
