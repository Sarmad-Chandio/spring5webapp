package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.service.GreetingServiceImpl;
import junit.framework.TestCase;

public class SetterInjectedControllerTest extends TestCase {
    SetterInjectedController setterInjectedController;

    public void setUp() throws Exception {
        super.setUp();
        //this is done automatically by Spring
        setterInjectedController= new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());

    }

    public void testSayHello() {
        System.out.println("SetterInjectedControllerTest "+setterInjectedController.sayHello());
    }
}