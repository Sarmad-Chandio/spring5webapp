package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.service.GreetingServiceImpl;
import junit.framework.TestCase;

public class ConstructorInjectedControllerTest extends TestCase {
    ConstructorInjectedController constructorInjectedController;

    public void setUp() throws Exception {
        super.setUp();
        //mimicking what Spring framework is doing
        constructorInjectedController=new ConstructorInjectedController(new GreetingServiceImpl());

    }

    public void testSayHello() {
        System.out.println("ConstructorInjectedControllerTest "+constructorInjectedController.sayHello());
    }
}