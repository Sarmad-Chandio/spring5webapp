package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.service.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService (GreetingService greetingService){
        this.greetingService= greetingService;
    }
    public String sayHello(){
        return greetingService.sayHello();
    }

}
