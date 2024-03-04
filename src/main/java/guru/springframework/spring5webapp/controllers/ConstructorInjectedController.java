package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.service.GreetingService;
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
       return greetingService.sayHello();
    }
}
