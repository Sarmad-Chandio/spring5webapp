package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.service.GreetingServiceImpl;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SetterInjectedControllerTest extends TestCase {
    @Autowired
    SetterInjectedController setterInjectedController;



    @Test
    public void testSayHello() {
        System.out.println("SetterInjectedControllerTest "+setterInjectedController.sayHello());
    }
}