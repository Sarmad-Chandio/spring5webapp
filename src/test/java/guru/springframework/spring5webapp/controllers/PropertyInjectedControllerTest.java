package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.service.GreetingServiceImpl;
import junit.framework.TestCase;

public class PropertyInjectedControllerTest extends TestCase {
    PropertyInjectedController propertyInjectedController;

    public void setUp() throws Exception {
        super.setUp();
        propertyInjectedController= new PropertyInjectedController();
        propertyInjectedController.greetingService= new GreetingServiceImpl();

    }

    public void testSayHello() {
        System.out.println("PropertyInjectedControllerTest "+propertyInjectedController.sayHello());
    }
}