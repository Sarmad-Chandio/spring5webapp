package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("I'm in controller");

        return "Hello Everyone!";
    }

}
