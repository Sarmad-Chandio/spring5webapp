package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.service.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }

}
